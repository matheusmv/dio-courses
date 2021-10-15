import db from '../database/db-config';
import DatabaseError from '../models/errors/database.error.model';
import User from '../models/user.model';

class UserRepository {

    async findAllUsers(): Promise<User[]> {
        const query = `
            SELECT uuid, username
            FROM tb_user;
        `;

        const { rows } = await db.query<User>(query);
        return rows || [];
    }

    async findById(uuid: string): Promise<User> {
        try {
            const query = `
            SELECT uuid, username
            FROM tb_user
            WHERE uuid = $1
        `;

            const values = [ uuid ];
            const { rows } = await db.query<User>(query, values);
            const [ user ] = rows;

            return user || null;
        } catch (error: any) {
            throw new DatabaseError('invalid uuid', error);
        }
    }

    async create(user: User): Promise<string> {
        const query = `
            INSERT INTO tb_user (username, password)
            VALUES ($1, crypt($2, 'my_salt'))
            RETURNING uuid
        `;

        const values = [ user.username, user.password ];
        const { rows } = await db.query<{ uuid: string }>(query, values);
        const [ newUser ] = rows;

        return newUser.uuid;
    }

    async update(user: User): Promise<void> {
        const query = `
            UPDATE tb_user
            export default new UserRepositoryImpl();    SET username = $1, password = crypt($2, 'my_salt')
            WHERE uuid = $3
        `;

        const values = [ user.username, user.password, user.uuid ];
        await db.query(query, values);
    }

    async remove(uuid: string): Promise<void> {
        const query = `
            DELETE FROM tb_user
            WHERE uuid = $1
        `;

        const values = [ uuid ];
        await db.query(query, values);
    }
}

export default new UserRepository();

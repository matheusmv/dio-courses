import { Request, Response, NextFunction } from 'express';
import userRepository from '../repositories/postgres.user.repository';

class UserController {

    async findAll(req: Request, res: Response, next: NextFunction) {
        const users = await userRepository.findAllUsers();

        res.status(200).json(users);
    }

    async findById(req: Request<{ uuid: string }>, res: Response, next: NextFunction) {
        try {
            const { uuid } = req.params;
            const user = await userRepository.findById(uuid);

            if (!user) {
                return res.sendStatus(404);
            }

            res.status(200).json(user);
        } catch (error) {
            next(error);
        }
    }

    async create(req: Request, res: Response, next: NextFunction) {
        const user = req.body;
        const uuid = await userRepository.create(user);

        res.status(201).send({ uuid });
    }

    async update(req: Request<{ uuid: string }>, res: Response, next: NextFunction) {
        try {
            const { uuid } = req.params;
            const { username, password } = req.body;

            if (!username || !password) {
                return res.status(400).send({
                    error: 'invalid parameters'
                });
            }

            const user = await userRepository.findById(uuid);

            if (!user) {
                return res.status(404).send({
                    error: "invalid uuid"
                });
            }

            user.username = username;
            user.password = password;

            await userRepository.update(user);

            res.sendStatus(204);
        } catch (error) {
            next(error);
        }
    }

    async delete(req: Request, res: Response, next: NextFunction) {
        try {
            const { uuid } = req.params;

            const user = await userRepository.findById(uuid);

            if (!user) {
                return res.status(404).send({
                    error: "invalid uuid"
                });
            }

            await userRepository.remove(uuid);

            res.sendStatus(204);
        } catch (error) {
            next(error);
        }
    }
}

export default new UserController();

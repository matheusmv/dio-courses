import { Pool } from 'pg';
import dotenv from 'dotenv';

dotenv.config();

const USER = process.env.DB_POSTGRES_USER;
const PASSWORD = process.env.DB_POSTGRES_PASSWORD;
const HOST = process.env.DB_HOST;
const DATABASE = process.env.DATABASE;

const connectionString = `postgres://${USER}:${PASSWORD}@${HOST}/${DATABASE}`;

const db = new Pool({ connectionString });

export default db;

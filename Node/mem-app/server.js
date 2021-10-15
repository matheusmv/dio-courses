const http = require('http');
const { stats } = require('./system-info');

const server = http.createServer((req, res) => {
  res.writeHead(200, { 'Content-Type': 'application/json' });
  res.end(JSON.stringify(stats()));
});

const HOST = 'http://localhost';
const PORT = 3000;

server.listen(PORT, () => {
  console.log(`server running on ${HOST}:${PORT}`);
});

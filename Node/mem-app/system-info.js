const os = require('os');

const { arch, platform, totalmem, freemem } = os;

const convertBytesToMega = bytes => Math.floor(bytes / Math.pow(1024, 2));
const getFreeRam = () => Math.floor(totalmem() - freemem());
const getMemoryUsage = () => Math.floor((freemem() / totalmem()) * 100);

const system_info = () => {
  return {
    OS: platform(),
    Arch: arch(),
    TotalRAM: `${convertBytesToMega(totalmem())} mb`,
    FreeRAM: `${convertBytesToMega(getFreeRam())} mb`,
    MemoryUsage: `${getMemoryUsage()} %`
  };
};

const getSystemDetails = () => {
  setInterval(() => {
    console.clear();
    console.table(system_info());
  }, 1000);
};

getSystemDetails();

exports.stats = system_info;

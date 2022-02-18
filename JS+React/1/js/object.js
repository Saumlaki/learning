//Объекты
const solder = {
    health:400,
    armor:100,
    sayHello:function(){
        console.log("Hello")
    }
    };
    
    const jonSolder = {
        health:100
    };
    
    Object.setPrototypeOf(jonSolder, solder);
    
    const maxSolder = Object.create(solder);
    
    console.dir(jonSolder);
    console.dir(maxSolder);
    maxSolder.sayHello();
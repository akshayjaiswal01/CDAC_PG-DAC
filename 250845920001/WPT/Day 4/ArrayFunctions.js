let arr = [10, 20, 40, 60, 70, 30, 50];


switch(4)
{
    case 1:
        arr.push(100);
        console.log(arr);
        break;

    case 2:
        arr.unshift(80);
        console.log(arr);
        break;

    case 3:
        arr.pop();
        console.log(arr);
        break;
    
    case 4:
        arr.shift();
        console.log(arr);
        break;
    
}
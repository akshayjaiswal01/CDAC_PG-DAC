function findmax(arr)
{
    arr.sort((a, b)=> a - b);

    let max = arr[arr.length-1];

    return max;
}

let arr = [100, 50, 60, 30, 20];

let max = findmax(arr);

console.log("Maximun element is: ",max);
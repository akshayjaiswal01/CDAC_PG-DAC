function findmax(arr)
{
    let max = arr[0];

    for(i=0; i<arr.length; i++)
    {
        if(arr[i] > max)
        {
            max = arr[i];
        }
    }
    return max;
}

let arr = [10, 50, 60, 30, 20];

let max = findmax(arr);

console.log("Maximun element is: ",max);
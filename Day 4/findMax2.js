function findmax(arr)
{
    let max = arr[0];

    arr.forEach(element =>
        {
            if(element > max)
            {
                max = element;
            }
        }
    );
    return max;
}

let arr = [10, 50, 60, 90, 20];

let max = findmax(arr);

console.log("Maximun element is: ",max);
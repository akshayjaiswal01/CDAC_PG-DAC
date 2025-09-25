const numbers = process.argv.slice(2).map(Number);

function isPrime(n) {
  if (n < 2) return false;
  for (let i = 2; i <= Math.sqrt(n); i++) {
    if (n % i === 0) return false;
  }
  return true;
}

let evenSum = 0;
for (let num of numbers) {
  if (num % 2 === 0) {
    evenSum += num;
  }
}

let evenIndexSum = 0;
for (let i = 0; i < numbers.length; i += 2) {
  evenIndexSum += numbers[i];
}

let primeSum = 0;
for (let num of numbers) {
  if (isPrime(num)) {
    primeSum += num;
  }
}

console.log("Numbers:", numbers);
console.log("Sum of even numbers:", evenSum);
console.log("Sum of even index numbers:", evenIndexSum);
console.log("Sum of prime numbers:", primeSum);

//=======================fizzBuzz program =========================
// const output='hi';
// console.log(fizzBuzz(output));

// function fizzBuzz(input)
// {
//     let output;
//     if (typeof input == 'number')
//     input % 5==0 && input % 3==0? output ='FizzBuzz' : ( input % 3==0 ? output= 'Fizz': (input % 5==0? output ='Buzz':output=input));
//     else output=NaN;
//     return output ;
// }

//=================================================================
//======================Speed Limit check==========================

// let speed=67;
// console.log(speedcheck(speed));

// function speedcheck(speed)
// {
//     if (typeof speed =='number')
//     {
//         //constants
//         const speedLimit = 70;
//         const kmPerPoit = 5;
//         //function
//         const points=Math.floor((speed-speedLimit)/kmPerPoit);
//         (points<1)?(output='OK'):(points>12?(output= 'License suspended'):(output='Points : '+points));
//         return output ;
//     }
//     else return NaN;
// }

//================================================================
//=======================String Check=============================

// let movie={
//     title:'Manadu',
//     hero:'Simbu',
//     Profit:40000,
//     price:130,
//     polama:'yes'
// }

// showProperties(movie);

// function showProperties(obj)
// {
//     for(key in obj)
//     {
//         if(typeof(obj[key])=='string')
//         console.log(key,obj[key]);
//     }
// }
//================================================================
//================sum of multiples of 3 and 5=====================

// let number=10;

// console.log(sum(number));

// function sum(number)
// {
//     let count=0;

//     for (let i=0;i<=number;i++)
//         if(i%3==0 || i %5==0)
//             count+=i;

//     return count;
// }

//================================================================
//=======================Grade Calculator=========================

// let marks=[100,90,110,80];

// gradelogger(marks);

// function gradelogger(allMarks)
// {
//     console.log('Average =',avg =averageCalculator(allMarks));
//     console.log('Grade = ',gradeCalculator(avg));
// }

// function averageCalculator(array)
// {
//     let sum=0;
//     for(value of array)
//     sum=sum+value;

//     return sum/array.length;
// }

// function gradeCalculator(average)
// {
//     if(average<60) return 'E';
//     if(average<70) return 'D';
//     if(average<80) return 'C';
//     if(average<90) return 'B';
    
//     return 'A'
// }

// ================================================================
// =========================
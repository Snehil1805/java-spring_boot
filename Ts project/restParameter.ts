/*A function has only one rest parameter.
The rest parameter appear last in the parameter list.
The type of the rest parameter is an array type.
*/
function combine(x:number,...args: any[]): any{
    let sum = 0;
    let strData = '';
    args.forEach((arg) => {
      if (typeof arg === 'number') {
        sum += arg;
      } else if (typeof arg === 'string') {
        strData += arg;
      }
    });
    console.log(x);
    return [sum, strData] ;
  }
  const [sum, strData]= combine(98,3, 'Good', 2, 1, ' Day');
  console.log({ sum });
  console.log({ strData });
  
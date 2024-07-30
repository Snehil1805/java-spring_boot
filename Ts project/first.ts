var userNam: string = "Vinothkumar";
console.log(userNam);
//Implicit
let myName = "ashokkumar";

console.log(typeof myName);
//Any Datatype
let data: any = "modi";
console.log(data);
data = 34; // no error as it can be "any" type
console.log(data);

//Any Datatype
let data1: any[] = ["modi",34];
//data = 34; // no error as it can be "any" type
console.log(data1);

//******Array****/
const studentName: string[] = [];
studentName.push("Vinoth"); 
studentName.push("Ashok"); 
console.log(studentName);
//**Array Type 1 */
const studentName1: string[] = ["Vinoth","Ashok"];
console.log(studentName1[0]);
console.log(studentName1[1]);
console.log("Length "+studentName1.length);


/******* Read Only */
const names: readonly string[] = ["Vinothkumar","Ashokkumar"];
//names[3]="Selva";
console.log(names);
/**************  */

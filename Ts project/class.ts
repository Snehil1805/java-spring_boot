class Student {
    studentId: number;
    firstName: string;
    lastName: string;

    constructor(studentId: number, firstName: string, lastName: string) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    getFullName(): void {
        console.log(`Student Details:
            \nStudent ID: ${this.studentId}
            \nStudent Name: ${this.firstName}
            \nLast Name ${this.lastName}`);
    }
}

// Creating a new Student object
let student1 = new Student(1, "vinoth", "selvaarasan");

student1.getFullName();








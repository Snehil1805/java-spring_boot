var Student = /** @class */ (function () {
    function Student(studentId, firstName, lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    Student.prototype.getFullName = function () {
        console.log("Student Details:\n            \nStudent ID: " + this.studentId + "\n            \nStudent Name: " + this.firstName + "\n            \nLast Name " + this.lastName);
    };
    return Student;
}());
// Creating a new Student object
var student1 = new Student(1, "vinoth", "selvaarasan");
student1.getFullName();

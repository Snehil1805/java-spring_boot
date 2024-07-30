// Function with default parameter
function greet(name, greeting) {
    if (greeting === void 0) { greeting = "Good Day"; }
    console.log(greeting + ", " + name + "!");
}
greet("Vinoth");
greet("vinoth", "Ashok");

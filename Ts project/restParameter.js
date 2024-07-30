/*A function has only one rest parameter.
The rest parameter appear last in the parameter list.
The type of the rest parameter is an array type.
*/
function combine(x) {
    var args = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        args[_i - 1] = arguments[_i];
    }
    var sum = 0;
    var strData = '';
    args.forEach(function (arg) {
        if (typeof arg == 'number') {
            sum += arg;
        }
        else if (typeof arg == 'string') {
            strData += arg;
        }
    });
    console.log(x);
    return [sum, strData];
}
var _a = combine(98, 3, 'Good', 2, 1, ' Day'), sum = _a[0], strData = _a[1];
console.log({ sum: sum });
console.log({ strData: strData });

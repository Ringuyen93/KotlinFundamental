fun main() {
    // 1: Kiểu dữ liệu
    // Kiểu số:
    // var : Từ khoá khai báo
    // number : Tên của biến
    // phép gán
    // Int -> số nguyên số không có phần thập phân
    // var number: Int = 10
//    var name: String = "Tho"
//    var location: String = "Ngo Quyen"
//    var favorite: String = "code"
//    var number1: Int = 5
//    var number2: Int = 10
//    var total: Int = number1 + number2
//    print(total)
    // Cộng
    // var total: Int = number1 + number2
    // Chia: 5 / 10 = 0
    // phương thức chuyển đổi kiểu dữ liệu: toFloat, toString..
//    var total = number1.toFloat() / number2.toFloat()
//    print
//    var totalPrice = 1_051_000
//    var total = totalPrice * 0.8
//    print(total)
//    var weight = 50
//    var height = 1.6
//    var bmi = weight / (height * height)
//    print(bmi)
    // Bài tập: Tính bmi
//    Chỉ số cơ thể: cân năng / chiều cao x chiều cao
//    var number = 5
//    number = number + 1
//    number += 1

    // Trường hợp value++
    // Có 2 biểu thức
    // 1 -> Gán giá trị trước
    // 2 -> Tăng giá trị lên 1
//    var number = 5
//    var number2 = 10
//
//    var total = number++ - --number2 + --number + number2++
    //    var total = number++ - --number2 + --number + number2++
    // Độ ưu tiên ++, -- lớn nhất
    // 5 - --number2 + --number + number2++, number = 6, number2 = 10
    // 5 - 9 + --number + number2++, number = 6, number2 = 9
    // 5 - 9 + 5 + number2++, number = 5, number2 = 9
    // 5 - 9 + 5 + 9, number = 5, number2 = 10
    // total = 10, number = 5, number2 = 10
//    println(total)
//    println(number)
//    println(number2)
    var a = 3
    var b = 5

    var total = a++ - --b - a++ + ++a - b-- - a++
    // 3 - --b - a++ + ++a -b-- - a++, a = 4, b = 5
    // 3 - 4 - a++ + ++a - b-- - a++, a = 4, b = 4
    // 3 - 4 - 4 + ++a - b-- - a++, a = 5, b = 4
    // 3 - 4 - 4 + 6 - b-- - a++, a = 6, b = 4
    // 3 - 4 - 4 + 6 - 4 - a++, a = 6, b = 3
    // 3 - 4 - 4 + 6 - 4 - 6, a = 7, b = 3
    // total = -9, a = 7, b = 3
    println(total)
    println(a)
    println(b)






}
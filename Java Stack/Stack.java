
//stack
public class Stack {
    public static void main(String[] args) {
        number(1);
    }

    static void number(int n) {
        System.out.println(n);
        number2(2);
    }

    static void number2(int n){
        System.out.println(n);
    }
}

//stack adalah tumpukan memori yang dimana menggunakan last in first out
//yang dimana dalam kode ini memiliki tumpukan yang pertama adalah
//void main
//void number
//void number 2


//aturan pertama dalam stack dimana ketika ada sebuah function yang belum selesai 
//diexecute maka ia akan berada tetap didalam stack memory

//Proses stack dimulai ketika kode ini berjalan yang dimana main menjadi tumpukan yg paling bawah
//karna didalam main ia akan memanggil function number berarti ia belum selesai di execute
//maka function main akan menjadi stack memori yang paling bawah
//Lalu didalam function void number memiliki sebuah function yang akan memanggil function number2
//yang dimana void number menjadi tumpukan kedua karna functon number belum juga selesai
//Didalam function number 2 ia akan hanya mengeluarkan output tanpa memanggil function lainnya

//ketika semua function sudah selesai diexecute maka ia akan dihapus dari dalam stack

//ketika function terakhir sudah diexecute maka function didalam stack tersebut akan keluar
//function number2 akan dihapus di tumpukan memori karena dia adalah function terakhir yang dijalankan dan sudah selesai di execute
//setelah function number 2 dihapus maka akan lanjut ke function number
//karna function number tidak ada penambahan dan number2 sudah selesai diexecute maka function number akan dihapus dari tumpukan memori
//setelah function number dihapus maka akan lanjut ke tumpukan paling bawah yaitu main
//karna function main tidak ada penambahan dan number sudah selesai diexecute maka function number akan dihapus dari tumpukan memori
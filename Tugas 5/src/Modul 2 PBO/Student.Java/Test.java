public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
    // pemanggilan metode setName dan setMark dari objek s1 untuk mengatur nama dan nilai siswa.
        s1.setName("Enkapsulasi");
        s1.setMark(90); 
    // menggunakan metode getName(). Outputnya akan berupa "s1Name is Enkapsulasi".
        System.out.println("s1Name is " + s1.getName());
    // mencetak nilai atau nilai siswa yang disimpan dalam objek s1 menggunakan metode getMark().
    //  Outputnya akan berupa "s1Mark is 90".
        System.out.println("s1Mark is " + s1.getMark());
    // untuk mencetak nama dan nilai atau nilai siswa yang disimpan dalam objek s1, 
    // menggunakan metode getName() dan getMark(). Outputnya akan berupa "name dan mark Enkapsulasi 90".
        System.out.println("name dan mark " + s1.getName() + " " + s1.getMark()); 
    }
}
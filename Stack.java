import java.util.Scanner;
public class Stack {
  private boolean empty, full;
  private int pos;// menujukkan tempat kosong
  private int max_data = 100;
  private int item[] = new int[max_data];

  public Stack() {
    full = false;
    empty = true;
    pos = 0;
  }// end of constructor

 // method isFull
  public boolean isFull() {
    return (full);
  }
// end of isFull method
   
// method isEmpty
  public boolean isEmpty() {
    return (empty);
  }
// end of isEmptyl method
   
// method push
public void push(int data){
if(!isFull()){
item[pos++] = data;
empty = false;
if(pos == max_data) full = true;
System.out.println("Data sudah ditambahkan");
}
else{
System.out.println("Stack sudah penuh");
}
return;
}
// end of push method
   
// method pop
public int pop(){
int x = 0;
if(!isEmpty()){
x = item[--pos];
full = false;
System.out.println("Data yang di POP adalah :"+ item[pos]);
System.out.println("");
item[pos]=0;
if(pos==0)empty = true;
else{
System.out.println("Stack Kosong!");
}
}else{
System.out.println("Stack Masih Kosong!\n");
}
return(x);
}
// end of pop method
   
// method Display

public void Display(){
System.out.println("Isi Stack Adalah : ");
//printing list item
for(int i=0; i<pos; i++){
System.out.print(item[i]+" ");
}
System.out.println("\n");
}
// end of Display

public static void main(String[] args) {
  int pilihan;
  int data;
  Stack result = new Stack();
  // looping until false condition
  do {
    // Displaying Menu
    System.out.println("1. PUSH Item");
    System.out.println("2. POP Item");
    System.out.println("3. Lihat Isi Data");
    System.out.println("0. Keluar");
    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan Pilihan :");
    pilihan = input.nextInt();
    // condition for choice
    if (pilihan == 1) {
      System.out.println("Data yang ditambahkan : ");
      data = input.nextInt();
      result.push(data);
    } else if (pilihan == 2) {
      result.pop();
    } else if (pilihan == 3) {
      result.Display();
    } else if (pilihan == 0) {
      System.exit(0);
    } else {
      System.out.println("Pilihan Tidak Ada!!");
    }
    // end of condition
  } while (pilihan != 0);// end looping
}
}

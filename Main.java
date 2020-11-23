
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        /*
        for(başlatma ; koşul ; arttırma veya azaltma işlemleri){
        Döngü KOşulu doğru olduğu sürece burası çalışacak

        }
        örnekler = 
        */
        
        int i ;
        for(i =0;i<10;i++){
        System.out.println("i ifademizin değeri " +i);
            //i = 10 olduğunda koşul bozulur ve döngüden çıkılır.
        }
        System.out.println("***************************************************************");

        //2. bir for tanımımız daha var
        for(int a = 0 ;a <=158;a++){
        System.out.println("a ifademizin aldığı değer "+a);
            /*
            Java ve c++ gibi dillerde(C buna dahil değil) bu yöntem bulunur..
            */

        }
        System.out.println("***************************************************************");
        //diğer bir for tanımlaması 
        for(int b =58;b>=0;b--){
        System.out.println("Geriden sayım ifademiz olan b nin güncel değeri = "+b);
        }
        System.out.println("***************************************************************");

   
    //diğer bir for tanımımız
        int c = 0;
        for(;c<85;c++){
        System.out.println("JAVAYI "+c +" .Kez tekrar ediyorum o yüzden artık JAVA BİLİYORUM");
}
        System.out.println("***************************************************************");
        int d = 0 ;
        int e = 10;
        for(;d<=10 && e>0;e--,d++){
        System.out.println("///////////////////////////////////////////////////////////////");
        System.out.println("d ifademizin değeri" +d+"e ifademizin değeri "+e);
        System.out.println("ÇARPIMLARININ SONUCU "+(d*e));
        System.out.println("TOPLAMLARININ SONUCU "+(d+e));
        System.out.println("Farkları : "+(d-e));
        System.out.println("bölümleri" +(double)(d/e));
        System.out.println("kalanı bulursak"+(double)(d%e));
        System.out.println("///////////////////////////////////////////////////////////////");
        System.out.println("---------------------------------------------------------------");

    }
        System.out.println("***************************************************************");
        //örnek bir yapı
        for( int g = 2;g<=100;g*=2){
            System.out.println("g = "+g);
        }
        //Faktriel projesi yapalım basic level = kullanıcıdan aldığımız sayının faktoriyelini alıyoruz
        Scanner scn = new Scanner(System.in);
        System.out.println("faktoriyelini lmak istediğiniz sayıyı yazınız ");
        int sayı = scn.nextInt();
        int fakt = 1;
        for(int l =1;l<=sayı;l++){
            fakt *= l;
            
        }
        System.out.println("sonuc = "+fakt);

}
}
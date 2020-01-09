# Making a basic dice game by using Java programming language

TURKISH

Kaynak kodu açıklaması:
Program çalıştıktan sonra ilk olarak, ekrana “Zar Oyununa Hoşgeldiniz. İyi Oyunlar!” yazısını bastıracak. Ardından verdiğimiz int round = 1; değeri ile round sayacını 1 rakamına eşitleyeceğiz.

Puanları ve random’ı oluşturma:
int oyuncu_puanı = 0; ve int bilgisayar_puanı = 0; ile bilgisayar ile oyuncunun puanlarını sıfıra eşitleyip, Random player1 = new Random(); methodu ile player1 için random kütüphanesini kullanarak rastgele bir rakam vermemizi sağlayacağız.

Random ayarlama:
int zar1 = player1.nextInt(6) ve int zar2 = player1.nextInt(6) kodları ile zar1 ile zar2 değişkenlerimize 0’dan 5’e kadar rastegele bir değer verilmesini sağlayacağız.
Aynı işlemi, 42. ve 43. satırlarda işlemci için rastgele değer sağlanması için yapacağız. Bir öncekinde gerçek kullanıcı (insan) için yapmıştık.

Gelen zarları belirlerken,
System.out.println("Birinci Zar: " + (cpu_zar1 + 1));
System.out.println("İkinci Zar: " + (cpu_zar2 + 1));
kodlarını kullandık. Burada önemli olan nokta, zarları attıktan sonra gelen sonucu bir sayı daha artırıyoruz çünkü, bizim attığımız zarların değeri 0’dan 5’e kadardı (player1.nextInt(6) = {0,1,2,3,4,5 yani toplamda 6 elemanlı bir dizi}).

If else blokları ve kullanıcıdan input alma:
If else blokları, kolayca anlaşılabileceği için üstünde fazla durmak istemiyorum. Fakat, 16.satırdan başlayan ve 75.satırda sona eren while(answer.equalsIgnoreCase("e")) döngüsü sayesinde program başlatıldıktan sonra zarlar atılacak ve ilk gelen sonuçların ardından kullanıcıya “Bir Tur Daha Oynamak İster Misiniz ? (E/H):” sorusu sorulacak. Eğer kullanıcı bu aşamada “E” Yazıp enter’a basarsa program önceki verileri de kaydederek bir kere daha karşılıklı zar attıracak ve çıkan sonuç önceki sonucun üstüne eklenecek. Kullanıcı “H” yazıp enter’a basarsa program sona erecek.

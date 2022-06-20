# homework-2

1. Java dünyasındaki frameworkler ve çözdükleri problemler nedir?
   (spring mvc, jsp, struct, vaadin). Örnekler ile açılayın.

 Yaklaşık 21 tane Java framework'ü bulunmaktadır. Framework'ler uygulamalarımıza bir yapı kazandırır. Örneğin, 
test için uygun bir framework'ümüz varsa, birçok şeyi otomatikleştirebilir, doğru ve tutarlı sonuçlar elde edebiliriz. Aynı şekilde, ORM, web uygulamaları, logging,
data management vb. için frameworkler varsa, bu geliştiricinin işini kolaylaştıracak ve uygulamada kullanılan ortak kod parçaları hakkında endişelenmek yerine iş mantığına daha fazla konsantre olacaktır.

Spring MVC

Spring framework içerisinde Servlet ve Spring modülleri ile birlikte MVC mimarisine göre
web tabanlı uygulamalar geliştirmek için kullanılan bir modüldür. Uygulama verileri Model
katmanında, kullanıcının görüntülemesini istediğimiz web sayfalarını View katmanında bulundurur ve bunun
arasındaki iş ve işlemlerin yapılacağı katman ise Controller katmanıdır.

JSP

JSP veya Java Server Pages, HTML kodları içerisine Java komutlarını kolay bir şekilde
yerleştirmek için kullanılan Java EE API kütüphanesidir.

Vaadin

Vaadin, GWT üzerine oturtulmuş, fakat onun gibi client-side çalışmayan, GWT widget'ları ile
extend edip add-on geliştirebileceğiniz, tema desteği olan, tam anlamıyla GUI geliştirmesi yapıyormuş havası veren,
Google App Engine dahil birçok servlet container'da çalışabilen, herhangi bir Java portal'a entegre
olabilen bir uygulama framework'üdür. GUI programlamanın Java'daki babaları Swing ve SWT gibi olay güdümlü
programlama mantığıyla çalışır ve widget yapısını barındırır. Swing tarzı bu yaklaşımıyla hızlı geliştirmeye, üretkenliğe ve
iş mantığına daha çok odaklanabilmesini sağlar.

2. Katmanlı mimari nedir?

Katmanlı mimari bir istemsi-sunucu mimarisidir. Uygulamayı katmanlarına ayırarak geliştiricilere bir katmanı düzenleme 
veya özel bir katman ekleme gibi seçenekler sunan bir modeldir. Bu mimari n-tier architecture pattern olarak da bilinir. Yazılım
mühendisliğinde de en çok kullanılan mimarilerden bir tanesidir. Geliştiricilerin esnek ve yeniden kullanılabilir uygulamalar oluşturmalarına olanak sağlar.
Her katmanın kendine özgü rolü ve sorumluluğu vardır. En çok kullanılan 3 katmanlı mimaridir(three-tier architecture).

3. Garbage collector nedir, nasıl çalışır? Diğer C++ ile karşılaştırın.

Java dilinde bir sınıftan oluşturulan nesnenin işi bittiğinde bellekte ona ayırılan yer boşaltılır.
Belleği boşaltma işlevi Garbage Collector'dır. Bir process başladığı anda bellekte bu process için boş bir yer ayırılır.
Bu ayrılan boşluğu heap bölgesi denir. Referanslar aracılığıyla heap bellekten nesnelerin yerleri tutulur.
RunTime'da oluşturulan nesneler, uygulama tarafından ihtiyaç duyulmadığı zamanlarda yada programda oluşturulan nesnenin işi bittiğinde,
heap bellekten temizlenir. Bu işlem için "Garbage Collector" mekanizması kullanılır.

C++ ve Java arasındaki temel fark, Garbage Collector'dır. Java, tüm belleği Garbage collector tarafından çalıştırır. Java gibi diller iyi verimlilik için dilin bir parçası olarak buna
ihtiyaç duyar. C++ gibi diller ise manuel bellek yönetimini destekler.

4. Spring Framework'unun kullandığı design pattern'ler neler?
- Singleton Pattern
- Factory Pattern
- Proxy Pattern
- Template Pattern

5. Creational patterns neler? Önceki ödevde oluşturduğunuz nesnelerinizi Factory Design Pattern'i ile oluşacak şekilde düzenleyin.

Creational Patterns, nesne yaratma mekanizmasıyla ilgilenen, uygulamamızda duruma uygun şekilde nesne yaratmaya çalışan tasarım kalıplarıdır.
Yani uygulamada nesnelerin oluşturulmasından sorumludur. Yazılımımızda nesnelerin standart şekilde oluşturulması tasarım ve performans sorunlarına yol açaibilir.

Singleton, Factory, Abstract Factory, Builder ve Prototype gibi patternler creational patternlerdir.

6. Singleton ve Abstarct Factory patternlerini implemente eden kodu yazın.
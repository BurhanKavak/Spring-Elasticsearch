# :triangular_flag_on_post: Elasticsearch

![](/images/logo.png)

## 🎯 Problem Nedir?

**Büyük verileri (Big Data) doğru bir şekilde saklayıp, analiz edebilmek için öncelikle ihtiyaçlarımızı iyi görebilmemiz gerekir.**

**Eğer büyük veri blokları arasında metin arama (full text search) gibi bir ihtiyacımız varsa, bu durumda hız oldukça önemli olacaktır. Bu konuda Elasticsearch bizim için doğru bir tercih olabilmektedir.**

## 🎯 Nedir Bu Elasticsearch?

**Elasticsearch, açık kaynaklı bir arama ve analitik motorudur. İleri düzey metin arama ve veri analitiği için optimize edilmiş dağıtık bir NoSQL veritabanıdır. Lucene arama kütüphanesinin üzerine inşa edilmiş olan Elasticsearch, ölçeklenebilir, hızlı ve gerçek zamanlı bir arama çözümü sunar.**

**Elasticsearch, yapılandırılabilir bir JSON tabanlı RESTful API'ye sahiptir. Bu API aracılığıyla, veriyi saklamak, aramak, analiz etmek ve gerçek zamanlı olarak sorgulamak mümkündür. Elasticsearch, belgeleri (dokümanlar) JSON formatında indeksler ve bu belgelere hızlı bir şekilde erişim sağlar.**

## 🎯 **Elasticsearch text üzerinden aramaları nasıl yapar?**

**Elasticsearch’e bir veri kaydettiğimiz zaman, veri içerisinde belirleğimiz alanlar Apache Lucene altyapısı kullanılarak indexlenir. Elasticsearch bir kelimenin hangi dökümanda(row) geçtiğini veriler kaydedilirken indexler . Sonrasında ise kelime aramak istediğimizde tüm veriler üzerinde arama yapmak yerine, daha önce oluşturulan index listesi üzerinden sonuçlar hızlıca bulunmaktadır.**

## 🎯 Temel özellikleri nelerdir?

1. **Dağıtık ve Ölçeklenebilir: Elasticsearch, verileri bir veya daha fazla düğüm üzerinde dağıtarak ölçeklenebilirlik sunar. Yeni düğümlerin eklenmesi veya var olan düğümlerin çıkarılması kolaydır. Bu sayede büyük veri kümeleriyle çalışmak mümkündür.**
2. **Gerçek Zamanlı Arama: Elasticsearch, arama sorgularını hızlı bir şekilde gerçekleştirir. İndekslenmiş verilere hızlı erişim sağlayarak gerçek zamanlı arama deneyimi sunar.**
3. **Esnek Veri Modeli: Elasticsearch, JSON tabanlı bir veri modeline sahiptir. Belge odaklı bir yaklaşım kullanarak, karmaşık veri yapılarını kolayca indeksleyebilir ve sorgulayabilirsiniz.**
4. **Tam Metin Arama: Elasticsearch, metin tabanlı arama için optimize edilmiştir. Metin indeksleme, arama, eşleşme ve sıralama işlemlerini destekler. Özellikle metin analizi, filtreleme, imla düzeltme ve benzeri işlemleri yapabilme yetenekleri mevcuttur.**
5. **Veri Analitiği: Elasticsearch, verileri analiz etmek için çeşitli araçlar ve özellikler sunar. Agregasyonlar, filtreler, histogramlar, istatistikler gibi işlevlerle verileri derinlemesine analiz edebilirsiniz.**
6. **Yüksek Kullanılabilirlik: Elasticsearch, birçok yüksek kullanılabilirlik özelliği sunar. Veri çoğaltma, otomatik düğüm kurtarma ve kesintisiz çalışma gibi mekanizmaları içerir.**

## 🎯 Kullanım alanları nelerdir?

**Elasticsearch'ün kullanım alanları oldukça geniştir. Örneğin, web siteleri veya e-ticaret platformları için hızlı ve doğru arama sonuçları sağlamak, log analizi, metin madenciliği, sosyal medya analitiği, zaman serisi verileri analizi ve daha birçok alanda kullanılabilir.**

**Örnek olarak, bir e-ticaret platformunda Elasticsearch kullanımını düşünebiliriz. Ürünlerin özelliklerini (isim, açıklama, fiyat, marka vb.) içeren belgeler Elasticsearch'e indekslenir. Kullanıcılar arama sorgularını gönderdiğinde Elasticsearch, hızlı bir şekilde eşleşen ürünleri döndürür. Metin tabanlı arama, filtreleme, sıralama ve agregasyon işlemleri kullanılarak kullanıcıların isteklerine uygun sonuçlar sağlanır.**

**Örneğin, kullanıcı "çaydanlık" kelimesini aratırsa Elasticsearch, çaydanlık ile ilgili ürünleri hızlı bir şekilde bulur ve sonuçları döndürür. Kullanıcılar arama sonuçlarını filtreleyebilir, fiyat aralığına göre sıralama yapabilir veya marka bazında gruplayabilir. Bu sayede kullanıcılara hızlı, esnek ve doğru arama deneyimi sunulmuş olur.**

## 🎯 Projemiz ne anlatıyor?

**Bizim projemizde ise Product adında bir nesnemiz bulunmaktadır. Örneğimizde ülker gofret ve sütaş ayran adında iki ürünümüz bulunmaktadır.**

**Arama kısmına sadece sütaş yazmak veya sadece ayran yazmak bize sütaş ayran ürününü getirecektir.**

**Aynı şekilde gofret sıralamak istiyorsak sadece ‘gof’ yazmamız bile gofretleri sıralamak için yeterli olacaktır.**

**Bu örneklerin görselleri aşağıda verilmektedir.**

![](/images/elastic1.png)
![](/images/elastic2.png)
![](/images/elastic3.png)

## :pushpin: Bağımlılık
```xml
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-elasticsearch</artifactId>
        </dependency>
```

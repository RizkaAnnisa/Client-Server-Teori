![img 1](image/client1.png)
# TUTORIAL SPRING BOOT DASAR
## Pengenalan Spring Framework

- Spring Framework adalah framework paling populer di Java

- Saking populernya, Spring Framework sampai mengalahkan popularitas Java Enterprise sendiri - -  Spring Framework dibuat sekitar tahun 2003 oleh Rod Johnson, yang dibuat sebagai alternative

- Java Enterprise

- Spring Framework semakin populer karena sangat ringan dan mudah digunakan dibandingkan Java Enterprise

- https://spring.io/

## Pengenalan Spring Boot

- Spring Boot merupakan framework untuk mempermudah pembuatan aplikasi Spring Framework

- Dahulu untuk menggunakan Spring Framework, untuk pemula tidaklah mudah, karena terlalu banyak yang harus dilakukan sebelum bisa membuat aplikasi

- Spring Boot menjadikan kompleksitas tersebut ditangani secara otomatis oleh Spring Boot. sehingga kita bisa membuat aplikasi Spring Framework secara cepat tanpa harus melakukan pengaturan apapun

- Spring Boot sekarang sudah menjadi salah satu framework wajib ketika kita ingin membuat aplikasi Spring Framework.

## Alasan Menggunakan Spring 
- Saat ini Spring adalah satu-satunya framework paling populer di Java.
- Belum ada yang bisa menandingi popularitasny di java, bahkan saking populernya, banyak perusahaan pindah ke JVM karena ingin menggunakan Spring-nya, bukan java.
- Dengan banyaknya bahasa yang bisa berjalan diatas JVM, seperti kotlin, Groovy dan Scala, maka secara programmer punya banyak pilihan bahasa pemrograman ketika menggunakan Spring.
- Spring juga sudah banyak diadopsi dibanyak perusahaan, baik dalam skala besar, maupun skala kecil.

## Ekosistem Pendukung

- Spring memiliki ekosistem pendukung yang sangat besar

- Spring sendiri tidaklah digunakan untuk menggantikan framework yang sudah ada, melainkan menjahit framework-framework yang sudah ada, menjadi framework yang saling terintegrasi

- Spring bisa digunakan terintegrasi dengan baik dengan Bean Validation, Java Persistence API. Servlet, dan lain-lain

- Selain itu juga Spring bisa diintegrasikan dengan teknologi yang tidak standar bawaan Java, seperti MongoDB, Consul, Vault, Cassandra, dan lain-lain.

## Membuat Project
- Klik link https://start.spring.io/

## Inversion of Control

- Inversion of Control (loC) merupakan prinsip dalam pembuatan perangkat lunak, dimana kita melakukan pemindahan kontrol untuk objek atau program ke sebuah container di framework
- Tidak seperti biasanya ketika kita membuat aplikasi, dimana kita selalu melakukannya secara manual, dalam loC, kita menyerahkan banyak pekerjakan ke container loc

- Container loC memiliki kontrol untuk melakukan eksekusi program kita, memanajemen object pada program kita dan melakukan abstraction terhadap program kita

- Saat menggunakan framework loc, kita biasanya akan mengikuti cara kerja framework tersebut

- Spring bisa dibilang adalah framework loC, dimana kita akan menyerahkan banyak sekali pekerjaan dalam program kita ke Spring

- Kode program kita akan mengikuti cara kerja Spring
this video

## Application Context

- ApplicationContext adalah sebuah interface representasi container loC di Spring

- ApplicationContext adalah inti dari Spring Framework

- ApplicationContext banyak sekali class implementasinya, secara garis besar dibagi menjadi 2 jenis implementasi, XML dan Annotation

- Pada versi Spring 3, XML masih menjadi pilihan utama, namun sekarang sudah banyak orang beralih dari XML ke Annotation, bahkan Spring Boot pun merekomendasikan menggunakan Annotation untuk membuat aplikasi Spring

- https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/ApplicationContext.html

## Membuat Application Context

- Selanjutnya, setelah membuat Class Configuration, kita bisa menggunakan class AnnotationConfigApplicationContext untuk membuat Application Context

- https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/ annotation/AnnotationConfigApplicationContext.html

## Singleton

- Singleton adalah salah satu Design Patterns untuk pembuatan objek, dimana sebuah object hanya dibuat satu kali saja

- Dan ketika kita membutuhkan object tersebut, kita hanya akan menggunakan object yang sama

- https://refactoring.guru/design-patterns/singleton

## Membuat Singleton di Java

- Ada banyak cara membuat singleton object di Java

- Cara yang paling sering digunakan adalah membuat class yang berisikan static method untuk membuat object dirinya sendiri

- Selanjutnya constructor nya dibuat private, agar tidak bisa diakses dari luar

- Sehingga user terpaksa menggunakan method static tersebut ketika ingin membuat object nya

## Bean

- Saat sebuah object kita masukkan kedalam Spring Container loC, maka kita sebut object tersebut adalah Bean

- Secara default, bean merupakan singleton, artinya jika kita mengakses bean yang sama, maka dia akan mengembalikan object yang sama. Kita juga bisa mengubahnya jika tidak ingin singleto.

## Membuat Bean

- Untuk membuat bean, kita bisa membuat sebuah method di dalam class Configuration

- Selanjutnya nama method tersebut akan menjadi nama bean nya, dan return object nya menjadi object bean nya

- Method tersebut perlu kita tambahkan annotation @Bean, untuk menandakan bahwa itu adalah bean. 

- Secara otomatis Spring akan mengeksekusi method tersebut, dan return value nya akan dijadikan object bean secara otomatis, dan disimpan di container loC.

## Mengakses Bean

- Setelah kita membuat bean, secara otomatis semua object akan di-manage dien Application Context
- Untuk mengakses bean, kita bisa menggunakan method getBean milik Application Context

## Duplicate Bean

- Di Spring, kita bisa mendaftarkan beberapa bean dengan tipe yang sama

- Namun perlu diperhatikan, jika kita membuat bean dengan tipe data yang sama, maka kita harus menggunakan nama bean yang berbeda

- Selain itu, saat kita mengakses bean nya, kita wajib menyebutkan nama bean nya, karena jika tidak, Spring akan bingung harus mengakses bean yang mana.

## Spring IO


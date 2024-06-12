bubble sort memiliki time complexity O(n2) karena menggunakan nested looping untuk menjalankan logic nya.

-outer loop menjalankan (n-1) iterasi dari nilai index (arr.length)
-inner loop mengulang iterasi sampai pada index yg belum di sort (arr.length - i - 1)

sehingga dapat diketahui di setiap loop menjalankan 

(n−1)+(n−2)+(n−3)+⋯+1

pada aritmatik progresion, jumlah dari formula diatas adalah

n(n−1)/2 atau (n^2-n)/2

sehingga dapat di simpulkan time complexity nya adalah O(n^2) jika nilai pada array tidak berurutan
dan O(n) jika nilai pada array berurutan.



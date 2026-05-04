1. Under what conditions would a pre-order and a breadth-first traversal be the same?
Penelusuran pre-order dan breadth-first akan menghasilkan urutan yang persis sama jika pohon tersebut berbentuk linear (setiap node maksimal hanya memiliki satu anak, sehingga bentuknya memanjang ke bawah menyerupai linked list), atau jika pohon tersebut hanya terdiri dari maksimal dua level (hanya ada root dan anak-anak langsungnya).

2. Suppose a directory structure has N files stored in n directories. Answer the following questions:
a. What is the run time of a traversal that prints out the directory names?
Untuk mencetak nama direktori, algoritma perlu menelusuri (traverse) setiap direktori yang ada di dalam struktur tersebut tepat satu kali. Karena hanya ada (n) direktori, maka kompleksitas waktunya linear terhadap jumlah direktori tersebut o(n).

b. What is the run time of a traversal that prints out the file names?
Untuk mencetak seluruh nama file (leaf nodes), algoritma tetap harus menelusuri seluruh direktori penyusunnya terlebih dahulu untuk menemukan file-file tersebut. Algoritma akan mengunjungi (n) direktori dan memproses (N) file, sehingga kompleksitas akhirnya adalah O(n + N).

c. How does your answer to Part b of this question change if you know that N = o(n)?
Jawabannya berubah menjadi O(N). Berdasarkan aturan Big-O Notation, karena N (jumlah file) mendominasi n (jumlah direktori), faktor (n) menjadi tidak signifikan untuk dihitung dan dapat diabaikan. Sehingga O(n + N) disederhanakan menjadi O(N).

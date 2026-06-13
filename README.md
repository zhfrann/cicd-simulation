# Basic Java Maven CI/CD

Project ini digunakan untuk tugas Manajemen Konfigurasi dan Evolusi Perangkat Lunak tentang penerapan CI/CD menggunakan GitHub Actions
<tes>

asdasdsad

## Teknologi

- Java 17
- Maven
- JUnit 4
- Maven Checkstyle Plugin
- GitHub Actions
- GitHub Packages

## Struktur Project

```text
.github/workflows/ci-cd.yml     Workflow CI/CD
src/main/java/...               Source code aplikasi
src/test/java/...               Unit test
pom.xml                         Konfigurasi Maven
```

## Cara Menjalankan di Lokal

```bash
mvn clean test
mvn checkstyle:checkstyle
mvn clean package
java -jar target/basic-java-maven-cicd-1.0.0.jar
```

## Alur CI/CD

### 1. Continuous Integration

Workflow berjalan saat ada `push` atau `pull_request` ke branch `main`.

Tahap yang dijalankan:

1. Checkout repository.
2. Setup JDK 17.
3. Menjalankan unit test dengan `mvn clean test`.
4. Menjalankan code inspection dengan `mvn checkstyle:checkstyle`.
5. Mengunggah hasil test dan inspection sebagai artifact.

### 2. Continuous Delivery

Setelah kode berhasil masuk ke branch `main`, workflow membangun file `.jar` dengan perintah:

```bash
mvn clean package
```

File `.jar` hasil build diunggah sebagai artifact GitHub Actions sehingga bisa diunduh dan diuji manual.

### 3. Continuous Deployment

Saat GitHub Release dibuat, workflow menjalankan:

```bash
mvn deploy
```

Hasil build dipublikasikan ke GitHub Packages sebagai Maven package.

## Bukti yang Perlu Di-screenshot untuk Laporan

1. Tampilan repository GitHub berisi project Maven.
2. File `.github/workflows/ci-cd.yml`.
3. Tab **Actions** yang menunjukkan workflow berhasil.
4. Detail job CI yang menunjukkan unit test berhasil.
5. Artifact `ci-test-inspection-reports` dan artifact `.jar`.
6. Tampilan GitHub Release.
7. Tampilan package yang berhasil dipublish di GitHub Packages.

## Kesimpulan

Dengan workflow ini, project sudah menerapkan CI/CD sederhana. CI memastikan kode diuji dan diperiksa setiap ada perubahan. Delivery menyediakan artifact `.jar` yang siap digunakan. Deployment mempublikasikan package secara otomatis ke GitHub Packages saat release dibuat.

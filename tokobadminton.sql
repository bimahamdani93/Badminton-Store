-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 13, 2021 at 12:30 PM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 7.4.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tokobadminton`
--

-- --------------------------------------------------------

--
-- Table structure for table `datapembeli`
--

CREATE TABLE `datapembeli` (
  `Nama` varchar(30) NOT NULL,
  `Tanggal` varchar(30) NOT NULL,
  `NoTelp` varchar(13) NOT NULL,
  `Pulau` varchar(20) NOT NULL,
  `Alamat` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `datapembeli`
--

INSERT INTO `datapembeli` (`Nama`, `Tanggal`, `NoTelp`, `Pulau`, `Alamat`) VALUES
('Stefan Wiliam', '23 Mei 2021', '089422227890', 'Kalimantan', 'Samarinda, Kalimantan Timur');

-- --------------------------------------------------------

--
-- Table structure for table `jersey`
--

CREATE TABLE `jersey` (
  `Merk` varchar(20) NOT NULL,
  `Ukuran` varchar(3) NOT NULL,
  `NamaPunggung` varchar(30) NOT NULL,
  `Harga` varchar(13) NOT NULL,
  `HargaUkuran` varchar(13) NOT NULL,
  `JumlahBarang` varchar(3) NOT NULL,
  `JasaKirim` varchar(20) NOT NULL,
  `Ongkir` varchar(13) NOT NULL,
  `TotalHarga` varchar(13) NOT NULL,
  `Pembayaran` varchar(10) NOT NULL,
  `StatusPengiriman` varchar(20) NOT NULL,
  `IDBarang` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `jersey`
--

INSERT INTO `jersey` (`Merk`, `Ukuran`, `NamaPunggung`, `Harga`, `HargaUkuran`, `JumlahBarang`, `JasaKirim`, `Ongkir`, `TotalHarga`, `Pembayaran`, `StatusPengiriman`, `IDBarang`) VALUES
('Li Ning', 'L', 'Kevin Sanjaya', '189000', '10000', '2', 'J&T Express', '19000', '417000', 'Indomaret', 'Sudah Dikirim', '6AB');

-- --------------------------------------------------------

--
-- Table structure for table `raket`
--

CREATE TABLE `raket` (
  `Merk` varchar(20) NOT NULL,
  `Harga` varchar(10) NOT NULL,
  `JenisGrip` varchar(13) NOT NULL,
  `HargaGrip` varchar(6) NOT NULL,
  `JumlahBarang` varchar(3) NOT NULL,
  `JasaKirim` varchar(15) NOT NULL,
  `Ongkir` varchar(13) NOT NULL,
  `TotalHarga` varchar(10) NOT NULL,
  `Pembayaran` varchar(10) NOT NULL,
  `StatusPengiriman` varchar(20) NOT NULL,
  `IDBarang` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `raket`
--

INSERT INTO `raket` (`Merk`, `Harga`, `JenisGrip`, `HargaGrip`, `JumlahBarang`, `JasaKirim`, `Ongkir`, `TotalHarga`, `Pembayaran`, `StatusPengiriman`, `IDBarang`) VALUES
('Li Ning', '450000', 'Handuk', '5000', '2', 'J&T Express', '19000', '929000', 'Transfer', 'Sudah Dikirim', 'A2B');

-- --------------------------------------------------------

--
-- Table structure for table `sepatu`
--

CREATE TABLE `sepatu` (
  `Merk` varchar(20) NOT NULL,
  `Harga` varchar(10) NOT NULL,
  `Warna` varchar(10) NOT NULL,
  `Nomor` varchar(2) NOT NULL,
  `HargaNomor` varchar(10) NOT NULL,
  `JumlahBarang` varchar(3) NOT NULL,
  `JasaKirim` varchar(20) NOT NULL,
  `Ongkir` varchar(10) NOT NULL,
  `TotalHarga` varchar(10) NOT NULL,
  `Pembayaran` varchar(10) NOT NULL,
  `StatusPengiriman` varchar(20) NOT NULL,
  `IDBarang` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sepatu`
--

INSERT INTO `sepatu` (`Merk`, `Harga`, `Warna`, `Nomor`, `HargaNomor`, `JumlahBarang`, `JasaKirim`, `Ongkir`, `TotalHarga`, `Pembayaran`, `StatusPengiriman`, `IDBarang`) VALUES
('Yonex', '1935000', 'Biru', '39', '0', '1', 'J&T Express', '19000', '1954000', 'Transfer', 'Sudah Dikirim', '4AD');

-- --------------------------------------------------------

--
-- Table structure for table `shuttlecock`
--

CREATE TABLE `shuttlecock` (
  `Merk` varchar(20) NOT NULL,
  `Harga` varchar(10) NOT NULL,
  `JumlahBarang` varchar(3) NOT NULL,
  `JasaKirim` varchar(20) NOT NULL,
  `Ongkir` varchar(13) NOT NULL,
  `TotalHarga` varchar(13) NOT NULL,
  `Pembayaran` varchar(13) NOT NULL,
  `StatusPengiriman` varchar(20) NOT NULL,
  `IDBarang` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `shuttlecock`
--

INSERT INTO `shuttlecock` (`Merk`, `Harga`, `JumlahBarang`, `JasaKirim`, `Ongkir`, `TotalHarga`, `Pembayaran`, `StatusPengiriman`, `IDBarang`) VALUES
('Garuda', '105000', '2', 'Wahana Express', '16000', '226000', 'COD', 'Dikirim 2 Hari Lagi', 'DR3');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `datapembeli`
--
ALTER TABLE `datapembeli`
  ADD PRIMARY KEY (`Nama`);

--
-- Indexes for table `jersey`
--
ALTER TABLE `jersey`
  ADD PRIMARY KEY (`IDBarang`);

--
-- Indexes for table `raket`
--
ALTER TABLE `raket`
  ADD PRIMARY KEY (`IDBarang`);

--
-- Indexes for table `sepatu`
--
ALTER TABLE `sepatu`
  ADD PRIMARY KEY (`IDBarang`);

--
-- Indexes for table `shuttlecock`
--
ALTER TABLE `shuttlecock`
  ADD PRIMARY KEY (`IDBarang`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

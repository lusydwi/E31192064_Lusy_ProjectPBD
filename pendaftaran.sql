-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 13, 2020 at 01:32 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `desktop`
--

-- --------------------------------------------------------

--
-- Table structure for table `pendaftaran`
--

CREATE TABLE `pendaftaran` (
  `namalengkap` varchar(50) CHARACTER SET latin1 NOT NULL,
  `tempatlahir` varchar(30) CHARACTER SET latin1 NOT NULL,
  `tanggallahir` varchar(30) CHARACTER SET latin1 NOT NULL,
  `jeniskel` enum('Laki-laki','Perempuan') NOT NULL,
  `agama` enum('Islam','Kristen Protestan','Kristen Katolik','Hindu','Budha','Konghucu') NOT NULL,
  `namaAyah` varchar(50) CHARACTER SET latin1 NOT NULL,
  `pekAyah` enum('Petani','PNS(TNI/Polri/Guru)','Pegawai Swasta','Pegawai BUMN','Wiraswasta','Advokad','Lainnya') NOT NULL,
  `namaIbu` varchar(50) CHARACTER SET latin1 NOT NULL,
  `pekIbu` enum('Ibu Rumah Tangga','Petani','PNS(TNI/Polri/Guru)','Pegawai Swasta','Pegawai BUMN','Wiraswasta','Advokad','Lainnya') NOT NULL,
  `PendAyah` enum('SD','SMP','SMA','D1, D2, D3','D4/S1','S2','S3') NOT NULL,
  `PendIbu` enum('SD','SMP','SMA','D1, D2, D3','D4/S1','S2','S3') NOT NULL,
  `alamat` varchar(1000) CHARACTER SET latin1 NOT NULL,
  `telepon` varchar(30) CHARACTER SET latin1 NOT NULL,
  `anakke` enum('1','2','3','4','5','>5') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pendaftaran`
--
ALTER TABLE `pendaftaran`
  ADD PRIMARY KEY (`namalengkap`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

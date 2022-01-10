-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 10, 2022 at 12:02 AM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 7.4.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `kepegawaian`
--

-- --------------------------------------------------------

--
-- Table structure for table `gaji`
--

CREATE TABLE `gaji` (
  `id` varchar(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `jabatan` varchar(20) NOT NULL,
  `gaji` varchar(200) NOT NULL,
  `jam` varchar(10) NOT NULL,
  `tunjangan` varchar(100) NOT NULL,
  `bonus` varchar(100) NOT NULL,
  `potongan` varchar(100) NOT NULL,
  `gaji_bersih` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `gaji`
--

INSERT INTO `gaji` (`id`, `nama`, `jabatan`, `gaji`, `jam`, `tunjangan`, `bonus`, `potongan`, `gaji_bersih`) VALUES
('210001', 'Auliya Hamdanah', 'IT Engineer', '2550000', '48', '100000.0', '0.0', '100000.0', '2650000.0'),
('210003', 'sasa', 'Hardware Engineer', '2000000', '48', '100000.0', '0.0', '100000.0', '2100000.0'),
('210004', 'Felix', 'System Analyst', '5250000', '40', '100000.0', '0.0', '100000.0', '5350000.0');

-- --------------------------------------------------------

--
-- Table structure for table `jabatan`
--

CREATE TABLE `jabatan` (
  `id` varchar(5) NOT NULL,
  `nama_jabatan` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `jabatan`
--

INSERT INTO `jabatan` (`id`, `nama_jabatan`) VALUES
('D01', 'Direktur'),
('D02', 'Hardware Engineer'),
('D03', 'IT Engineer'),
('D04', 'Manager'),
('D05', 'Staff');

-- --------------------------------------------------------

--
-- Table structure for table `karyawan`
--

CREATE TABLE `karyawan` (
  `id` varchar(20) NOT NULL,
  `nama_lengkap` varchar(50) NOT NULL,
  `jabatan` varchar(30) NOT NULL,
  `alamat` varchar(200) NOT NULL,
  `no_telp` varchar(20) NOT NULL,
  `email` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `karyawan`
--

INSERT INTO `karyawan` (`id`, `nama_lengkap`, `jabatan`, `alamat`, `no_telp`, `email`) VALUES
('210001', 'Auliya Hamdanah', 'IT Engineer', 'Banjarbaru', '082156667777', 'Auliya@gmail.com'),
('210003', 'Jihoon', 'Web Developer', 'Martapura', '082144566589', 'jihoon@gmail.com'),
('210004', 'Felix', 'System Analyst', 'Banjarmasin', '081267894567', 'felix@gmail.com'),
('210006', 'Lengakara', 'Network Architect', '`Banjarbaru', '082189667789', 'kara@gmail.com'),
('210007', 'Syifa', 'System Analyst', 'Banjarmasin', '082199784567', 'syifa@gmail.com'),
('210008', 'Muhammad Nabil', 'System Analyst', 'palam', '089545657898', 'Nabil@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `gaji`
--
ALTER TABLE `gaji`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `jabatan`
--
ALTER TABLE `jabatan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `karyawan`
--
ALTER TABLE `karyawan`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

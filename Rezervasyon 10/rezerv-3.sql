-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Anamakine: localhost
-- Üretim Zamanı: 06 Ara 2023, 21:05:32
-- Sunucu sürümü: 10.4.28-MariaDB
-- PHP Sürümü: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `rezerv`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `buyticket`
--

CREATE TABLE `buyticket` (
  `Realid` int(11) NOT NULL,
  `id` int(100) NOT NULL,
  `PassangerName` varchar(100) NOT NULL,
  `PassangerSurname` varchar(100) NOT NULL,
  `TcNo` varchar(100) NOT NULL,
  `Day` varchar(100) NOT NULL,
  `SeatNumber` varchar(100) NOT NULL,
  `Payment` int(100) NOT NULL,
  `BirthDay` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Tablo döküm verisi `buyticket`
--

INSERT INTO `buyticket` (`Realid`, `id`, `PassangerName`, `PassangerSurname`, `TcNo`, `Day`, `SeatNumber`, `Payment`, `BirthDay`) VALUES
(18, 68, 'Melis', 'Portakal', '23424234', '4', '1', 200, '14032000'),
(19, 68, 'Mert', 'Omer', '23123', '4', '10', 200, '28072009'),
(20, 69, 'Emir', 'Cetin', '32423423', '4', '13', 200, '13031111');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `company`
--

CREATE TABLE `company` (
  `id` int(11) NOT NULL,
  `CompName` varchar(255) NOT NULL,
  `CompPass` varchar(255) NOT NULL,
  `VehicleName` varchar(255) NOT NULL,
  `VehicleType` varchar(255) NOT NULL,
  `FuelType` varchar(255) NOT NULL,
  `SeatNumber` varchar(255) NOT NULL,
  `SeferNo` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Tablo döküm verisi `company`
--

INSERT INTO `company` (`id`, `CompName`, `CompPass`, `VehicleName`, `VehicleType`, `FuelType`, `SeatNumber`, `SeferNo`) VALUES
(68, 'A', '123', 'Otobus 1', 'Bus', 'Benzin', '20', 3),
(69, 'A', '123', 'Train 1', 'Train', 'Elektrik', '25', 1),
(72, 'B', '123', 'Bus 1', 'Bus', 'Benzin', '35', 4),
(95, 'A', '123', 'Bus 3', 'Bus', 'Motorin', '15', 4),
(96, 'A', '123', 'Train 2', 'Train', 'Elektrik', '20', 2),
(97, 'A', '123', 'Plane 2', 'Plane', 'Benzin', '20', 5),
(112, 'B', '123', 'Bus 2', 'Bus', 'Motorin', '20', 3),
(114, 'C', '123', 'Plane 1', 'Plane', 'Gaz', '10', 5);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `demiryolufiyat`
--

CREATE TABLE `demiryolufiyat` (
  `KalkisN` varchar(100) NOT NULL,
  `Istanbul` int(100) NOT NULL,
  `Kocaeli` int(100) NOT NULL,
  `Ankara` int(100) NOT NULL,
  `Eskisehir` int(100) NOT NULL,
  `Konya` int(100) NOT NULL,
  `Bilecik` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Tablo döküm verisi `demiryolufiyat`
--

INSERT INTO `demiryolufiyat` (`KalkisN`, `Istanbul`, `Kocaeli`, `Ankara`, `Eskisehir`, `Konya`, `Bilecik`) VALUES
('Ankara', 250, 200, 0, 100, 0, 150),
('Bilecik', 150, 50, 150, 50, 200, 0),
('Eskisehir', 200, 100, 100, 0, 150, 50),
('Istanbul', 0, 50, 250, 200, 300, 150),
('Kocaeli', 50, 0, 200, 100, 250, 50),
('Konya', 300, 250, 0, 150, 0, 200);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `havayolufiyat`
--

CREATE TABLE `havayolufiyat` (
  `KalkisN` varchar(100) NOT NULL,
  `Istanbul` int(100) NOT NULL,
  `Ankara` int(100) NOT NULL,
  `Konya` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Tablo döküm verisi `havayolufiyat`
--

INSERT INTO `havayolufiyat` (`KalkisN`, `Istanbul`, `Ankara`, `Konya`) VALUES
('Ankara', 1000, 0, 0),
('Istanbul', 0, 1000, 1200),
('Konya', 1200, 0, 0);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `karayolufiyat`
--

CREATE TABLE `karayolufiyat` (
  `KalkisN` varchar(100) NOT NULL,
  `Istanbul` int(100) NOT NULL,
  `Kocaeli` int(100) NOT NULL,
  `Ankara` int(100) NOT NULL,
  `Eskisehir` int(100) NOT NULL,
  `Konya` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Tablo döküm verisi `karayolufiyat`
--

INSERT INTO `karayolufiyat` (`KalkisN`, `Istanbul`, `Kocaeli`, `Ankara`, `Eskisehir`, `Konya`) VALUES
('Ankara', 300, 400, 0, 0, 0),
('Eskisehir', 150, 100, 0, 0, 150),
('Istanbul', 0, 50, 300, 150, 300),
('Kocaeli', 50, 0, 400, 100, 250),
('Konya', 300, 250, 0, 150, 0);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `karayolukm`
--

CREATE TABLE `karayolukm` (
  `KalkisN` varchar(100) NOT NULL,
  `Istanbul` int(100) NOT NULL,
  `Kocaeli` int(100) NOT NULL,
  `Ankara` int(100) NOT NULL,
  `Eskisehir` int(100) NOT NULL,
  `Konya` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Tablo döküm verisi `karayolukm`
--

INSERT INTO `karayolukm` (`KalkisN`, `Istanbul`, `Kocaeli`, `Ankara`, `Eskisehir`, `Konya`) VALUES
('Ankara', 500, 400, 0, 0, 0),
('Eskisehir', 300, 200, 0, 0, 300),
('Istanbul', 0, 100, 500, 300, 600),
('Kocaeli', 100, 0, 400, 200, 500),
('Konya', 600, 500, 0, 300, 0);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `sefernot`
--

CREATE TABLE `sefernot` (
  `SeferNo` int(100) NOT NULL,
  `UlasimTuru` varchar(100) NOT NULL,
  `Istanbul` int(100) NOT NULL,
  `Kocaeli` int(100) NOT NULL,
  `Eskisehir` int(100) NOT NULL,
  `Konya` int(100) NOT NULL,
  `Bilecik` int(100) NOT NULL,
  `Ankara` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Tablo döküm verisi `sefernot`
--

INSERT INTO `sefernot` (`SeferNo`, `UlasimTuru`, `Istanbul`, `Kocaeli`, `Eskisehir`, `Konya`, `Bilecik`, `Ankara`) VALUES
(1, 'Demiryolu', 1, 1, 1, 0, 1, 1),
(2, 'Demiryolu', 1, 1, 1, 1, 1, 0),
(3, 'Karayolu', 1, 1, 0, 0, 0, 1),
(4, 'Karayolu', 1, 1, 1, 1, 0, 0),
(5, 'Havayolu', 1, 0, 0, 1, 0, 0),
(6, 'Havayolu', 1, 0, 0, 0, 0, 1);

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `buyticket`
--
ALTER TABLE `buyticket`
  ADD PRIMARY KEY (`Realid`);

--
-- Tablo için indeksler `company`
--
ALTER TABLE `company`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `demiryolufiyat`
--
ALTER TABLE `demiryolufiyat`
  ADD PRIMARY KEY (`KalkisN`);

--
-- Tablo için indeksler `havayolufiyat`
--
ALTER TABLE `havayolufiyat`
  ADD PRIMARY KEY (`KalkisN`);

--
-- Tablo için indeksler `karayolufiyat`
--
ALTER TABLE `karayolufiyat`
  ADD PRIMARY KEY (`KalkisN`);

--
-- Tablo için indeksler `karayolukm`
--
ALTER TABLE `karayolukm`
  ADD PRIMARY KEY (`KalkisN`);

--
-- Tablo için indeksler `sefernot`
--
ALTER TABLE `sefernot`
  ADD PRIMARY KEY (`SeferNo`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `buyticket`
--
ALTER TABLE `buyticket`
  MODIFY `Realid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- Tablo için AUTO_INCREMENT değeri `company`
--
ALTER TABLE `company`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=119;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

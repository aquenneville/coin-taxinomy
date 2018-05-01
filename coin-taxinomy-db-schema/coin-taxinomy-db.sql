-- phpMyAdmin SQL Dump
-- version 4.6.5.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 01, 2018 at 04:49 PM
-- Server version: 5.6.34-log
-- PHP Version: 5.5.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `coin_taxinomy_db`
--
CREATE DATABASE IF NOT EXISTS `coin_taxinomy_db` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `coin_taxinomy_db`;

-- --------------------------------------------------------

--
-- Table structure for table `article`
--

CREATE TABLE `article` (
  `id` int(10) UNSIGNED NOT NULL,
  `title` varchar(100) NOT NULL,
  `article_date` date NOT NULL,
  `url` int(11) NOT NULL,
  `path` varchar(100) NOT NULL,
  `summary` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `asset`
--

CREATE TABLE `asset` (
  `id` int(10) UNSIGNED NOT NULL,
  `name` varchar(30) NOT NULL,
  `max_supply` int(11) NOT NULL,
  `symbol` varchar(10) NOT NULL,
  `creation_date` year(4) DEFAULT NULL,
  `home_url` varchar(100) NOT NULL,
  `fiat` tinyint(1) DEFAULT NULL,
  `consensus` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `asset_exchange_listing`
--

CREATE TABLE `asset_exchange_listing` (
  `id` int(11) NOT NULL,
  `listin_nb` int(10) UNSIGNED NOT NULL,
  `asset_id` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `asset_fork`
--

CREATE TABLE `asset_fork` (
  `id` int(10) UNSIGNED NOT NULL,
  `asset_id` int(10) UNSIGNED NOT NULL,
  `parent_asset_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `asset_partnership`
--

CREATE TABLE `asset_partnership` (
  `id` int(10) UNSIGNED NOT NULL,
  `company_id` int(10) UNSIGNED NOT NULL,
  `asset_id` int(10) UNSIGNED NOT NULL,
  `article_id` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `asset_price_forecast`
--

CREATE TABLE `asset_price_forecast` (
  `id` int(10) UNSIGNED NOT NULL,
  `asset_id` int(10) UNSIGNED NOT NULL,
  `year` int(11) UNSIGNED NOT NULL,
  `price_forecast` int(11) UNSIGNED NOT NULL,
  `from_date` date NOT NULL,
  `article_id` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `asset_property`
--

CREATE TABLE `asset_property` (
  `id` int(10) UNSIGNED NOT NULL,
  `asset_id` int(10) UNSIGNED NOT NULL,
  `is_caas` tinyint(1) NOT NULL,
  `is_store_of_value` tinyint(1) NOT NULL,
  `is_ico` tinyint(1) NOT NULL,
  `is_ico_platform` tinyint(1) NOT NULL,
  `is_payment` tinyint(1) NOT NULL,
  `has_protocol_improvement` tinyint(1) NOT NULL,
  `is_utility_token` tinyint(1) NOT NULL,
  `has_smart_contracts` tinyint(1) NOT NULL,
  `summary` varchar(200) DEFAULT NULL,
  `notes` varchar(200) DEFAULT NULL,
  `capitalization_type` varchar(75) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `company`
--

CREATE TABLE `company` (
  `id` int(10) UNSIGNED NOT NULL,
  `name` varchar(30) NOT NULL,
  `website` varchar(30) DEFAULT NULL,
  `crunchbase_id` varchar(30) DEFAULT NULL,
  `industry` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `keyword_article_asset`
--

CREATE TABLE `keyword_article_asset` (
  `id` int(10) UNSIGNED NOT NULL,
  `keyword` varchar(20) NOT NULL,
  `asset_id` int(10) UNSIGNED NOT NULL,
  `article_id` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT;

-- --------------------------------------------------------

--
-- Table structure for table `market`
--

CREATE TABLE `market` (
  `id` int(11) NOT NULL,
  `exchange_id` int(10) UNSIGNED NOT NULL,
  `asset_id` int(10) UNSIGNED NOT NULL,
  `pair` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `owner_portfolio`
--

CREATE TABLE `owner_portfolio` (
  `id` int(11) UNSIGNED NOT NULL,
  `company_id` int(10) UNSIGNED DEFAULT NULL,
  `person_of_interest_id` int(10) UNSIGNED DEFAULT NULL,
  `portfolio_name` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT;

-- --------------------------------------------------------

--
-- Table structure for table `owner_portfolio_asset`
--

CREATE TABLE `owner_portfolio_asset` (
  `id` int(10) UNSIGNED NOT NULL,
  `owner_portfolio_id` int(10) UNSIGNED NOT NULL,
  `asset_id` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT;

-- --------------------------------------------------------

--
-- Table structure for table `person_of_interest`
--

CREATE TABLE `person_of_interest` (
  `id` int(10) UNSIGNED NOT NULL,
  `name` varchar(30) NOT NULL,
  `twitter_id` varchar(30) DEFAULT NULL,
  `website` int(11) DEFAULT NULL,
  `company_id` int(11) UNSIGNED DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `website_identifier`
--

CREATE TABLE `website_identifier` (
  `id` int(10) UNSIGNED NOT NULL,
  `name` varchar(30) NOT NULL,
  `value` varchar(50) NOT NULL,
  `asset_id` int(10) UNSIGNED NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `article`
--
ALTER TABLE `article`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `asset`
--
ALTER TABLE `asset`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `asset_exchange_listing`
--
ALTER TABLE `asset_exchange_listing`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_asset_exchange_asset` (`asset_id`);

--
-- Indexes for table `asset_fork`
--
ALTER TABLE `asset_fork`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_asset_fork_asset` (`asset_id`);

--
-- Indexes for table `asset_partnership`
--
ALTER TABLE `asset_partnership`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_asset_partnership_company` (`company_id`),
  ADD KEY `fk_asset_partnership_asset` (`asset_id`),
  ADD KEY `fk_asset_partnership_article` (`article_id`);

--
-- Indexes for table `asset_price_forecast`
--
ALTER TABLE `asset_price_forecast`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_asset_price_forecast_asset` (`asset_id`),
  ADD KEY `fk_asset_price_forecast_article` (`article_id`);

--
-- Indexes for table `asset_property`
--
ALTER TABLE `asset_property`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_asset_property_asset_id` (`asset_id`);

--
-- Indexes for table `company`
--
ALTER TABLE `company`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `keyword_article_asset`
--
ALTER TABLE `keyword_article_asset`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_keyword_article_asset_asset` (`asset_id`),
  ADD KEY `fk_keyword_article_asset_article` (`article_id`);

--
-- Indexes for table `market`
--
ALTER TABLE `market`
  ADD KEY `fk_market_company` (`exchange_id`),
  ADD KEY `fk_market_asset` (`asset_id`);

--
-- Indexes for table `owner_portfolio`
--
ALTER TABLE `owner_portfolio`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_company_portfolio_company` (`company_id`),
  ADD KEY `fk_owner_portfolio_people_of_interest` (`person_of_interest_id`);

--
-- Indexes for table `owner_portfolio_asset`
--
ALTER TABLE `owner_portfolio_asset`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_company_portfolio_content_company_portfolio` (`owner_portfolio_id`),
  ADD KEY `fk_company_portfolio_content_asset` (`asset_id`);

--
-- Indexes for table `person_of_interest`
--
ALTER TABLE `person_of_interest`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_person_of_interest_company` (`company_id`);

--
-- Indexes for table `website_identifier`
--
ALTER TABLE `website_identifier`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_website_identifier_asset` (`asset_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `article`
--
ALTER TABLE `article`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `asset`
--
ALTER TABLE `asset`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `asset_exchange_listing`
--
ALTER TABLE `asset_exchange_listing`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `asset_fork`
--
ALTER TABLE `asset_fork`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `asset_partnership`
--
ALTER TABLE `asset_partnership`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `asset_price_forecast`
--
ALTER TABLE `asset_price_forecast`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `asset_property`
--
ALTER TABLE `asset_property`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `company`
--
ALTER TABLE `company`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `keyword_article_asset`
--
ALTER TABLE `keyword_article_asset`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `owner_portfolio`
--
ALTER TABLE `owner_portfolio`
  MODIFY `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `owner_portfolio_asset`
--
ALTER TABLE `owner_portfolio_asset`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `person_of_interest`
--
ALTER TABLE `person_of_interest`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `website_identifier`
--
ALTER TABLE `website_identifier`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `asset_exchange_listing`
--
ALTER TABLE `asset_exchange_listing`
  ADD CONSTRAINT `fk_asset_exchange_asset` FOREIGN KEY (`asset_id`) REFERENCES `asset` (`id`);

--
-- Constraints for table `asset_fork`
--
ALTER TABLE `asset_fork`
  ADD CONSTRAINT `fk_asset_fork_asset` FOREIGN KEY (`asset_id`) REFERENCES `asset` (`id`);

--
-- Constraints for table `asset_partnership`
--
ALTER TABLE `asset_partnership`
  ADD CONSTRAINT `fk_asset_partnership_company` FOREIGN KEY (`company_id`) REFERENCES `company` (`id`),
  ADD CONSTRAINT `fk_company_article` FOREIGN KEY (`article_id`) REFERENCES `article` (`id`),
  ADD CONSTRAINT `fk_company_asset` FOREIGN KEY (`asset_id`) REFERENCES `asset` (`id`);

--
-- Constraints for table `asset_price_forecast`
--
ALTER TABLE `asset_price_forecast`
  ADD CONSTRAINT `fk_asset_price_forecast_article` FOREIGN KEY (`article_id`) REFERENCES `article` (`id`),
  ADD CONSTRAINT `fk_asset_price_forecast_asset` FOREIGN KEY (`asset_id`) REFERENCES `asset` (`id`);

--
-- Constraints for table `asset_property`
--
ALTER TABLE `asset_property`
  ADD CONSTRAINT `fk_asset_property_asset_id` FOREIGN KEY (`asset_id`) REFERENCES `asset` (`id`);

--
-- Constraints for table `keyword_article_asset`
--
ALTER TABLE `keyword_article_asset`
  ADD CONSTRAINT `fk_keyword_article_asset_article` FOREIGN KEY (`article_id`) REFERENCES `article` (`id`),
  ADD CONSTRAINT `fk_keyword_article_asset_asset` FOREIGN KEY (`asset_id`) REFERENCES `asset` (`id`);

--
-- Constraints for table `market`
--
ALTER TABLE `market`
  ADD CONSTRAINT `fk_market_asset` FOREIGN KEY (`asset_id`) REFERENCES `asset` (`id`),
  ADD CONSTRAINT `fk_market_company` FOREIGN KEY (`exchange_id`) REFERENCES `company` (`id`);

--
-- Constraints for table `owner_portfolio`
--
ALTER TABLE `owner_portfolio`
  ADD CONSTRAINT `fk_owner_portfolio_company` FOREIGN KEY (`company_id`) REFERENCES `company` (`id`),
  ADD CONSTRAINT `fk_owner_portfolio_people_of_interest` FOREIGN KEY (`person_of_interest_id`) REFERENCES `person_of_interest` (`id`);

--
-- Constraints for table `owner_portfolio_asset`
--
ALTER TABLE `owner_portfolio_asset`
  ADD CONSTRAINT `fk_owner_portfolio_content_asset` FOREIGN KEY (`asset_id`) REFERENCES `asset` (`id`),
  ADD CONSTRAINT `fk_owner_portfolio_content_company_portfolio` FOREIGN KEY (`owner_portfolio_id`) REFERENCES `owner_portfolio` (`id`);

--
-- Constraints for table `person_of_interest`
--
ALTER TABLE `person_of_interest`
  ADD CONSTRAINT `fk_person_of_interest_company` FOREIGN KEY (`company_id`) REFERENCES `company` (`id`);

--
-- Constraints for table `website_identifier`
--
ALTER TABLE `website_identifier`
  ADD CONSTRAINT `fk_website_identifier_asset` FOREIGN KEY (`asset_id`) REFERENCES `asset` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

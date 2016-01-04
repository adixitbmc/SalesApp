SELECT * FROM ProductTable;

SELECT * FROM SalesEntry;

SELECT b.ProductName, SUM(a.ItemsSold) "Total # sold", SUM(a.SaleAmount) "Total Amount" from SalesEntry a, ProductTable b WHERE a.ProductID = b.ProductID GROUP BY a.ProductID
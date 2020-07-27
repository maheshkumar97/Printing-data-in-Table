package com.mvc.get;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String productName;
	private String company;
	private String type;
	private double price;
	private int sales;

	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Products(int id, String productName, String comapny, String type, double price, int sales) {
		super();
		this.id = id;
		this.productName = productName;
		this.company = comapny;
		this.type = type;
		this.price = price;
		this.sales = sales;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String comapny) {
		this.company = comapny;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getSales() {
		return sales;
	}

	public void setSales(int sales) {
		this.sales = sales;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", company=" + company + ", type=" + type
				+ ", price=" + price + ", sales=" + sales + "]";
	}

	
}

package com.example.demo;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	@Entity
	public class Product {
		public int id;
		public float tag00;
		public String date;
		public String time;
		protected Product() {
		}
		protected Product(int id, float tag00, String date, String time) {
			super();
			this.id = id;
			this.tag00 = tag00;
			this.date = date;
			this.time = time;
		}
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public float getTAG00() {
			return tag00;
		}
		public void setTAG00(float tag00) {
			this.tag00 = tag00;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}	
		public String getTime() {
			return time;
		}
		public void setTime(String time) {
			this.time = time;
		}
	}

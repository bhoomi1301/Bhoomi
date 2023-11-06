package com.dataHiding;

public class Account {
		private int AccNo;
		private int IFSCcode;
		protected String Location;
		double amount;
		
		protected void info() {
			System.out.println("Inside protected method");
		}
		
		public int getAccNo() {
			return AccNo;
		}
		
		public void setAccNo(int AccNo) {
			this.AccNo = AccNo;
		}
		
		public int getIFSCcode() {
			return IFSCcode;
		}
		
		public void setIFSCcode(int IFSCcode) {
			this.IFSCcode = IFSCcode;
		}
}

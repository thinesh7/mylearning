package com.builderdp;

public class BankAccount {

	private String accHolderName;
	private String accNo;
	private String accType;

	public BankAccount(BankAccountBuilder bankAccountBuilder) {
		this.accHolderName = bankAccountBuilder.accHolderName;
		this.accNo = bankAccountBuilder.accNo;
		this.accType = bankAccountBuilder.accType;
	}

	public static BankAccountBuilder builder() {
		return new BankAccountBuilder();
	}

	public static class BankAccountBuilder {
		private String accHolderName;
		private String accNo;
		private String accType;

		public BankAccountBuilder setAccHolderName(String accHolderName) {
			this.accHolderName = accHolderName;
			return this;
		}

		public BankAccountBuilder setAccNo(String accNo) {
			this.accNo = accNo;
			return this;
		}

		public BankAccountBuilder setAccType(String accType) {
			this.accType = accType;
			return this;
		}

		public BankAccount build() {
			return new BankAccount(this);
		}

	}

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	@Override
	public String toString() {
		return "BankAccount [accHolderName=" + accHolderName + ", accNo=" + accNo + ", accType=" + accType + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof BankAccount) {
			return this.accNo.equals(((BankAccount) obj).accNo);
		}
		return false;
	}

}

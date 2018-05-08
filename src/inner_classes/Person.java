package inner_classes;

public class Person {
	private String mNume;
	private int mAge;
	private Address mAddress;

	public class Address {
		public class PostalAddress {
			// $$$ Address.this
			String mPostalCode;
			String mCountryCode;
		}
		
		// $$$ Persoana.this
		private String mCountry;
		private String mCity;
		private String mStreet;
		private PostalAddress mPostalAddress;

		private Address(String pCountry, String pCity, String pStreet) {
			super();
			mCountry = pCountry;
			mCity = pCity;
			mStreet = pStreet;
			mPostalAddress = new PostalAddress();
		}

		@Override
		public String toString() {
			String numePersoana = Person.this.mNume;
			return "Address [mCountry=" + mCountry + ", mCity=" + mCity + ", mStreet=" + mStreet + "]";
		}

	}

	public Person(String pNume, int pAge, String pCountry, String pCity, String pStreet) {
		super();
		mNume = pNume;
		mAge = pAge;
		mAddress = new Address(pCountry, pCity, pStreet);
	}

	public Person() {
		super();
	
	}
	
	

	public String getNume() {
		return mNume;
	}

	public void setNume(String pNume) {
		mNume = pNume;
	}

	public int getAge() {
		return mAge;
	}

	public void setAge(int pAge) {
		mAge = pAge;
	}

	public Address getAddress() {
		return mAddress;
	}

	static Address createAddress(String pCountry, String pCity, String pStreet) {
		Person p = new Person();
		Address a = p.new Address(pCountry, pCity, pStreet);
		a.new PostalAddress();

		return a;
		
	}

}

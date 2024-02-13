package data.type;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
	private BigDecimal principal;
	private BigDecimal interest;

	public SimpleInterestCalculator(String principal, String interest) {
		this.principal = new BigDecimal(principal);
		this.interest = new BigDecimal(interest);
	}

	public BigDecimal calculateTotalValue(int years) {
		BigDecimal result = principal.multiply(interest).multiply(new BigDecimal(years).divide(new BigDecimal("100")));
		return this.principal.add(result);
	}

	public BigDecimal getPrincipal() {
		return principal;
	}

	public void setPrincipal(BigDecimal principal) {
		this.principal = principal;
	}

	public BigDecimal getInterest() {
		return interest;
	}

	public void setInterest(BigDecimal interest) {
		this.interest = interest;
	}

}

package com.tencent.pattern.builder;

/**
 * Created by masonqwli on 16/2/15.
 */
public class Holiday {

	private String desp;

	private Holiday(String desp) {
		this.desp = desp;
	}

	@Override
	public String toString() {
		return desp;
	}

	static class Builder {
		StringBuilder sb = new StringBuilder();

		public Holiday build() {
			return new Holiday(sb.toString());
		}

		Builder addDay() {
			sb.append("add one day").append("\n");
			return this;
		}

		Builder addHotel() {
			sb.append("add hotel").append("\n");
			return this;
		}

		Builder addPerson() {
			sb.append("add one person").append("\n");
			return this;
		}

		Builder addTicket() {
			sb.append("add ticket").append("\n");
			return this;
		}
	}
}

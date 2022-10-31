package org.zerock.controller.service.lecture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.lecture.JavaBean18;
import org.zerock.mapper.lecture.Mapper11;

@Service
public class Service01 {
	@Autowired
	private Mapper11 mapper;

	public JavaBean18 getCustomer(int id) {
		// 비지니스 로직
		return mapper.getCustomerById(id);
		
		public void transferMoney() {
			//1번 고객의 돈을 (500원)
			//2번 고객에게 전달
			int cnt = mapper.updateBank(1, -500);
			
		}
	}
}

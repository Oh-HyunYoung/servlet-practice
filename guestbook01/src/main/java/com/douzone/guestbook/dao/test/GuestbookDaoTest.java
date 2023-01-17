package com.douzone.guestbook.dao.test;

import java.util.List;

import com.douzone.guestbook.dao.GuestbookDao;
import com.douzone.guestbook.vo.GuestbookVo;

public class GuestbookDaoTest {
	public static void main(String[] args) {
		GuestbookVo vo = new GuestbookVo();
		vo.setName("둘리");
		vo.setPassword("1234");
		vo.setMessage("안녕하세요");
		vo.setRegDate("2023-01-17");
		
		testInsert(vo);
		testDeleteByGuestno(1L,"1234");
		testFindAll();
	}

	private static void testDeleteByGuestno(Long no, String password) {
		new GuestbookDao().deleteByNoAndPassword(no, password);
	}

	private static void testFindAll() {
		List<GuestbookVo> list = new GuestbookDao().findAll();
		for(GuestbookVo vo : list) {
			System.out.println(vo);
		}
	}

	private static void testInsert(GuestbookVo vo) {
		new GuestbookDao().insert(vo);
		
	}

}

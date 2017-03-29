package junit_test.service.impl;

import org.springframework.stereotype.Service;

import junit_test.service.TestService;
@Service
public class TestServiceImpl implements TestService {

	@Override
	public String getStr(String text) {
		return "服务器返回：" + text;
	}

}

package com.youjia.springcloud.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;

/**
 * @Author: youjia
 * @Description: rest请求headers中统一添加默认值
 * @ClassName: HeadClientHttpRequestInterceptor
 * @Create: 22/1/26 15:02
 * @Version: 1.0
 */

@Slf4j
public class HeadClientHttpRequestInterceptor implements ClientHttpRequestInterceptor {

    @Override
    public ClientHttpResponse intercept(HttpRequest httpRequest, byte[] bytes,
                                        ClientHttpRequestExecution clientHttpRequestExecution) throws IOException {
        HttpHeaders headers = httpRequest.getHeaders();
        headers.add("Accept", "application/json");
        headers.add("Accept-Encoding", "gzip");
        headers.add("Content-Encoding", "UTF-8");
        headers.add("Content-Type", "application/json; charset=UTF-8");
        ClientHttpResponse response = clientHttpRequestExecution.execute(httpRequest, bytes);
        HttpHeaders headersResponse = response.getHeaders();
        headersResponse.add("Accept", "application/json");
        return response;
    }

}

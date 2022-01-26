package com.youjia.springcloud.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @Author: youjia
 * @Description: rest远程调用日志统一打印
 * @ClassName: TrackLogClientHttpRequestInterceptor
 * @Create: 22/1/26 14:47
 * @Version: 1.0
 */

@Slf4j
public class TrackLogClientHttpRequestInterceptor implements ClientHttpRequestInterceptor {
    @Override
    public ClientHttpResponse intercept(HttpRequest httpRequest, byte[] body,
                                        ClientHttpRequestExecution execution) throws IOException {

        trackRequest(httpRequest, body);
        ClientHttpResponse httpResponse = execution.execute(httpRequest, body);
        trackResponse(httpResponse);
        return httpResponse;
    }

    private void trackResponse(ClientHttpResponse response) throws IOException {
        log.debug("=========== response begin ===========");
        log.debug("status code：{}", response.getStatusCode());
        log.debug("=========== response end =============");
    }

    private void trackRequest(HttpRequest request, byte[] body) {
        log.debug("=========== request begin ============");
        log.debug("uri：{}", request.getURI());
        log.debug("method：{}", request.getMethod());
        log.debug("body：{}", new String(body, StandardCharsets.UTF_8));
        log.debug("=========== request end ==============");
    }

}

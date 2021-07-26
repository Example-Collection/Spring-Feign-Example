# Synchronous API Call using Feign

<h2>프로젝트 실행 방법</h2>

- 이 프로젝트는 2개의 모듈(`SampleFeignClient`, `SampleServer`)로 구성되어 있습니다.   
  시연을 위해서는 2개의 애플리케이션을 모두 실행해야 합니다.
  
- `SampleFeignClient`는 8081번, `SampleServer`는 8082번 포트에서 실행됩니다.

- `SampleFeignClient(:8081)`의 `/v1/send-feign-api-call`에 요청을 보내면   
  `SampleFeignClient`는 내부적으로 `SampleServer(:8082)`의 `/v1/sample`에   
  요청을 보내고, 그 응답을 클라이언트에게 반환해줍니다.

<h3>개발하며 정리한 글</h3>

- <a href="https://github.com/sang-w0o/Study/blob/master/Spring/MSA/Feign%20%EC%82%AC%EC%9A%A9%ED%95%98%EA%B8%B0.md">링크</a>
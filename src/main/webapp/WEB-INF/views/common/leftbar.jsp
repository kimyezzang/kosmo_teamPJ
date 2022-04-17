<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://kit.fontawesome.com/63d3d77b59.js" crossorigin="anonymous"></script>
</head>
<body>
        <nav id="sidebar">
            <div class="sidebar-header">
                <a href="${path}/main"><img src="${path}/resources/images/logo/logo1.png" style="width:100%;"></a>
                <strong><img src="${path}/resources/images/logo/logo8.png" style="width:100%;"></strong>
            </div>

            <ul class="list-unstyled components">
                <li>
                    <a href="#menu1" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">
                        <i class="fas fa-copy"></i>
                        	회원정보
                    </a>
                    <ul class="collapse list-unstyled" id="menu1">
                        <li>
                            <a href="#">정보조회</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#menu2" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">
                        <i class="fas fa-copy"></i>
                        	예약정보
                    </a>
                    <ul class="collapse list-unstyled" id="menu2">
                        <li>
                            <a href="#">예약정보</a>
                        </li>
                        <li>
                            <a href="#">예약변경</a>
                        </li>
                        <li>
                            <a href="#">예약하기</a>
                        </li>
                        <li>
                            <a href="#">예약취소</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#menu3" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">
                        <i class="fas fa-copy"></i>
                        	검사결과
                    </a>
                    <ul class="collapse list-unstyled" id="menu3">
                        <li>
                            <a href="#">기초검사결과</a>
                        </li>
                        <li>
                            <a href="#">운동검사결과</a>
                        </li>
                        <li>
                            <a href="#">심리검사결과</a>
                        </li>
                        <li>
                            <a href="#">종합검사결과</a>
                        </li>
                    </ul>
                </li>
                <li>
                    <a href="#menu4" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">
                        <i class="fas fa-copy"></i>
                        	검사안내
                    </a>
                    <ul class="collapse list-unstyled" id="menu4">
                        <li>
                            <a href="#">선택검사</a>
                        </li>
                    </ul>
                </li>
                <li>
                  <a href="#menu5" data-toggle="collapse" aria-expanded="false" class="dropdown-toggle">
                      <i class="fas fa-copy"></i>
                      	병원소개
                  </a>
                  <ul class="collapse list-unstyled" id="menu5">
                      <li>
                          <a href="#">오시는길</a>
                      </li>
                  </ul>
                </li>
            </ul>
        </nav>
        
        
</body>
</html>
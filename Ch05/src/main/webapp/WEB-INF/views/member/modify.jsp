<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>member::modify</title>
	</head>
	<body>
		<h3>member 수정</h3>
		<a href="/Ch05">Ch05 메인</a>
		<a href="/Ch05/member/list">member 목록</a>
		
		<form action="/Ch05/member/modify" method="post">
			<table border="1">
				<tr>
					<td>아이디</td>
					<td><input type="text" name="uid" value="${ user.uid }" readonly="readonly"></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="name" value="${ user.name }"></td>
				</tr>
				<tr>
					<td>휴대폰</td>
					<td><input type="text" name="hp" value="${ user.hp }"></td>
				</tr>
				<tr>
					<td>직급</td>
					<td>
						<label><input type="radio" name="pos" value="사원" ${ user.pos eq '사원' ? 'checked' : '' }>사원</label>
						<label><input type="radio" name="pos" value="대리" ${ user.pos eq '대리' ? 'checked' : '' }>대리</label>
						<label><input type="radio" name="pos" value="차장" ${ user.pos eq '차장' ? 'checked' : '' }>차장</label>
						<label><input type="radio" name="pos" value="과장" ${ user.pos eq '과장' ? 'checked' : '' }>과장</label>
						<label><input type="radio" name="pos" value="부장" ${ user.pos eq '부장' ? 'checked' : '' }>부장</label>
					</td>
				</tr>
				<tr>
					<td>dep</td>
					<td>
						<label><input type="radio" name="dep" value="101" ${ user.dep eq '101' ? 'checked' : '' }>101</label>
						<label><input type="radio" name="dep" value="102" ${ user.dep eq '102' ? 'checked' : '' }>102</label>
						<label><input type="radio" name="dep" value="103" ${ user.dep eq '103' ? 'checked' : '' }>103</label>
						<label><input type="radio" name="dep" value="104" ${ user.dep eq '104' ? 'checked' : '' }>104</label>
						<label><input type="radio" name="dep" value="105" ${ user.dep eq '105' ? 'checked' : '' }>105</label>
					</td>
				</tr>
				<tr>
					<td colspan="2" align="right"><input type="submit" value="수정"></td>
				</tr>
			</table>
		</form>
		
	</body>
</html>
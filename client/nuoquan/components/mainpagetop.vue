<template>
	<view class="topgrandfather">
		<view class="dad1">
			<image class="dad1touxiang" src="../../static/touxiang.jpg"></image>
			<input class="dad1search" placeholder="  搜索" />
			<view class="dad1plus"><view style="font-size: 20px;color:#FDD041;border-radius: 3px;">+</view></view>
			<view class="dad1waiting"></view>
		</view>
		<view class="dad2">话题榜</view>

		<view class="dad3">
			<view class="person31">
				<view class="son311" style="font-size: 21px;margin-bottom: 14px;">1</view>
				<view class="son312" style="font-size: 15px;margin-bottom: 14px;">麻辣鸡结婚了</view>
			</view>
			<view class="person32">
				<view class="son321" style="font-size: 17px;margin-bottom: 12px;">2</view>
				<view class="son322" style="font-size: 13px;margin-bottom: 12px;">打吊瓶看熊猫被终生免票打吊瓶看熊猫被...</view>
			</view>
			<view class="person33">
				<view class="son331" style="font-size: 15px;">3</view>
				<view class="son332" style="font-size: 13px;">高考成绩今日公布</view>
			</view>
		</view>
	</view>
</template>

<script>
export default {
	data() {
		return {};
	}
};
</script>

<style>
.topgrandfather {
	padding-top: 4px;
	height: 168px;
	width: 100%;
	background: #fdd041;
	box-shadow: 0 -2px 10px #000000;
	border-bottom-right-radius: 25px;
	border-bottom-left-radius: 25px;
}
.dad1touxiang {
	width: 30px;
	height: 30px;
	border-radius: 30px;
	display: inline-block;
	vertical-align: middle;
	margin-left: 12px;
}
.dad1search {
	font-size: 15px;
	display: inline-block;
	width: 190px;
	height: 28px;
	vertical-align: middle;
	border-radius: 8px;
	margin-left: 13px;
	background: white;
	letter-spacing: 1px;
	color: #b2b2b2;
	font-family: MicrosoftYaHei;
	line-height: 10px;
}
.dad1plus {
	font-size: 25px;
	background: #FFFFFF;
	display: inline-block;
	height: 25px;
	width: 25px;
	vertical-align: middle;
	text-align: center;
	margin-left: 10px;
	border-radius: 3px;
	line-height:23px;
}
.dad2 {
	color: #ffffff;
	margin-left: 29px;
	font-size: 13px;
	font-weight: bold;
	margin-top: 16px;
}
.dad3 {
}
.person31 {

}

.person32{
	
}
	
.person33{
}
.son311,.son321,.son331{
	color: #FFFFFF;
	width:77px;
	font-weight:bold;
	text-align: center;
	vertical-align: middle;
	display: inline-block;
}
.son312,.son322,.son332{
	display: inline-block;
	vertical-align: middle;
	color:#FFFFFF;
}
</style>

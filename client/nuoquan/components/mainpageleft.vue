<template>
	<view class="leftgrandfather">
		<view class="dad1">
			<view class="person11"><image class="touxiang" src="../../static/touxiang.jpg"></image></view>
			<view class="person12">
				<view style="font-size: 13px;margin-bottom:9px;">壹贰叁</view>
				<view style="font-size:8px ;font-weight: bold;margin-bottom:3px;">zy21000</view>
				<view style="color:#B2B2B2;font-size: 0.5px;width:80px;position: relative;left: 10px;">@nottingham.edu.cn</view>
			</view>
		</view>
		<view class="dad2">
			
			<view class="person2X">
				<image src="../../static/icon/评论.svg"></image>
				<view>我的发布</view>
			</view>

			<view class="person2X">
				<image src="../../static/icon/评论.svg"></image>
				<view>我的消息</view>
			</view>

			<view class="person2X">
				<image src="../../static/icon/评论.svg"></image>
				<view>我的收藏</view>
			</view>
			<view class="person2X">
				<image src="../../static/icon/评论.svg"></image>
				<view>举报投诉</view>
			</view>
			<view class="person2X">
				<image src="../../static/icon/评论.svg"></image>
				<view>关于</view>
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
@keyframes slidefromleft {
	from {
		display: none;
	}
	to {
		display: block;
	}
}
.leftgrandfather {
	padding-top: 44px;
	background: #fcfcfc;
	animation: slidefromleft 3s;
	width: 174px;
	height: 100%;
	position: fixed;
	left: 0;
	top: 0;
	z-index: 1;
	box-shadow: 1px 0px 5px #a6a6a6;
	border-bottom-right-radius: 80px;
}
.dad1 {
	margin-top: 29px;
}
.person11 {
	margin-left: 20px;
	display: inline-block;
	width: 60px;
}
.touxiang {
	height: 60px;
	width: 60px;
	border-radius: 60px;
}
.person12 {
	display: inline-block;
	margin-left: 8px;
	height: 60px;
	width: 80px;
}
.dad2 {
	margin-top: 40px;
}
.person2X{
		margin-left: 34px;
		 margin-bottom: 20px;
		
	
}
.person2X image{
	width:20px;
	height:20px;
	display: inline-block;
	vertical-align: middle;
}
.person2X view{
	display: inline-block;
	font-size:13px ;
	font-weight: bold;
	margin-left: 17px;	
}
</style>

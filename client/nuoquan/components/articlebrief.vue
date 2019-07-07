<template>
	<view class="articlecard">
		<view class="title">{{ articlecontent[1] }}</view>
		<view class="briefarticlecontent">{{ articlecontent[2] }}</view>
		<view class="picturearea">
			<image src='require(`picadress}.`);picaddress' v-if="articlecontent[3]"></image>
			<image src="../../static/0001/pic2.jpg" v-if="articlecontent[4]"></image>
			<image src="../../static/0001/pic3.jpg" v-if="articlecontent[5]"></image>
			
		</view>
		<view class="tags">
			<view class="tag" v-for="i in taglist" v-bind:key="i[0]" :style="i[1]">{{i[0]}}</view>
		</view>
		<view class="menubar">
			<image src="../../static/touxiang.jpg" class="touxiang"></image>
			<view class="name">{{ articlecontent[6] }}</view>
			<view class="time">{{ articlecontent[7] }}</view>
			
			<view class="icons">
				<view class="iconbg"></view>
				<image class="comment" src="../../static/icon/评论.svg"></image>
				<image class="like" src="../../static/icon/点赞.svg"></image>
			</view>
		</view>
	</view>
</template>

<script>
export default {
	name: 'aticlebrief',
	props: {
		articlecontent: {
			type: Array
		},
		picaddress:'../../static/0001/pic1.jpg',
	},
	data() {
		return {
			taglist:[["123","background:red"],["13","background:blue"],["163","background:yellow"]],
		};
	},
	methods: {},
	created: function() {
		console.log('777');

		console.log(this.articlecontent);
	}
};
</script>

<style>
.articlecard {
	width:650upx;
	border-radius: 8px;;
	margin: 11px auto 0;
	background-color: #FFFFFF;
}
.title {
	margin:16px 25px 0 25px;
	font-size: 15px;
	font:MicrosoftYaHei;
	font-weight: bold;
	line-height: 19px;
	margin: 16px 13px 0 15px;
	padding-top: 16px;
}
.briefarticlecontent {
	margin: 10px 13px 0 15px;
	font-size: 13px;
	line-height: 15px;
	margin-bottom: 15px;

}
.tags{
	
}
.tag{
	display: inline-block;
	border-radius: 10px;
	padding-left: 5px;
	padding-right: 5px;
	margin-left: 5px;
}
.menubar {
	position: relative;
	vertical-align: middle;
	margin-left: 15px;
	border-radius: 8px;
}
.touxiang {
	border-radius: 30px;
	width: 20px;
	height: 20px;
	margin-right: 5px;
	vertical-align: middle;
}
.name {
	display: inline-block;
	font-size: 10px;
	margin-left: 7px;
	color: #888888;
}
.time {
	display: inline-block;
	left: 120px;
	font-size: 10px;
	margin-left: 25px;
	color: #888888;
}
.icons {
	position: absolute;
	right: 0;
	width: 103px;
	text-align: right;
	display: inline-block;
	content-flex: right;
	overflow: hidden;
	border-bottom-right-radius: 8px;
box-shadow:-4px  -2px 2px 0px #888888 inset;

 }
.iconbg{
	background: #FDD041;
	position: absolute;
	width:100%;
	height:50px;
	border-top-left-radius: 50px;
/* 	display: none;
 */}
.icons image {
	width: 11px;
	height: 11px;
	padding-right: 10px;
}
.picturearea {
	margin: auto;
	display: flex;
	justify-content: center;
}

image {
	width: 30%;
	height: 200upx;
	margin: auto;
}
</style>

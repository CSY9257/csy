
/**
 * 目前这种实现方法，只能保证生成的id是唯一的，而无法保证其是递增的。原因是为了解决高可用，进行多机部署；
 * 前段时间看到微信关于信息的唯一id,它的实现思路是单机，并不保证高可用，因为这个信息短暂的不可用，用户是可以接受的。
 * 这个方案在电商交易系统我认为是不可行的，id服务不可用,即意味着不能下单，这个是不能容忍的。
 * 
 * 
 * 如何寻找一个趋势递增的实现呢？
 * 
 * 
 */
package com.z.idleaf.support;

import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import UserProfileManager from "./components/listers/UserProfileCards"
import UserProfileDetail from "./components/listers/UserProfileDetail"

import MatchingAlgorithmManager from "./components/listers/MatchingAlgorithmCards"
import MatchingAlgorithmDetail from "./components/listers/MatchingAlgorithmDetail"

import MatchingResultManager from "./components/listers/MatchingResultCards"
import MatchingResultDetail from "./components/listers/MatchingResultDetail"

import ChatRoomManager from "./components/listers/ChatRoomCards"
import ChatRoomDetail from "./components/listers/ChatRoomDetail"
import ChatMessageManager from "./components/listers/ChatMessageCards"
import ChatMessageDetail from "./components/listers/ChatMessageDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/userProfiles',
                name: 'UserProfileManager',
                component: UserProfileManager
            },
            {
                path: '/userProfiles/:id',
                name: 'UserProfileDetail',
                component: UserProfileDetail
            },

            {
                path: '/matchingAlgorithms',
                name: 'MatchingAlgorithmManager',
                component: MatchingAlgorithmManager
            },
            {
                path: '/matchingAlgorithms/:id',
                name: 'MatchingAlgorithmDetail',
                component: MatchingAlgorithmDetail
            },

            {
                path: '/matchingResults',
                name: 'MatchingResultManager',
                component: MatchingResultManager
            },
            {
                path: '/matchingResults/:id',
                name: 'MatchingResultDetail',
                component: MatchingResultDetail
            },

            {
                path: '/chatRooms',
                name: 'ChatRoomManager',
                component: ChatRoomManager
            },
            {
                path: '/chatRooms/:id',
                name: 'ChatRoomDetail',
                component: ChatRoomDetail
            },
            {
                path: '/chatMessages',
                name: 'ChatMessageManager',
                component: ChatMessageManager
            },
            {
                path: '/chatMessages/:id',
                name: 'ChatMessageDetail',
                component: ChatMessageDetail
            },



    ]
})
